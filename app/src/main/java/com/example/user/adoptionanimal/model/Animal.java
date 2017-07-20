package com.example.user.adoptionanimal.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable{
    private String _id;
    private String Name;
    private String Sex;
    private String Type;
    private String Build;
    private String Age;
    private String Variety;
    private String Reason;
    private String AcceptNum;
    private String ChipNum;
    private String IsSterilization;
    private String HairType;
    private String Note;
    private String Resettlement;
    private String Phone;
    private String Email;
    private String ChildreAnlong;
    private String AnimalAnlong;
    private String Bodyweight;
    private String ImageName;

    public Animal(){
    }

    protected Animal(Parcel in) {
        _id = in.readString();
        Name = in.readString();
        Sex = in.readString();
        Type = in.readString();
        Build = in.readString();
        Age = in.readString();
        Variety = in.readString();
        Reason = in.readString();
        AcceptNum = in.readString();
        ChipNum = in.readString();
        IsSterilization = in.readString();
        HairType = in.readString();
        Note = in.readString();
        Resettlement = in.readString();
        Phone = in.readString();
        Email = in.readString();
        ChildreAnlong = in.readString();
        AnimalAnlong = in.readString();
        Bodyweight = in.readString();
        ImageName = in.readString();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getBuild() {
        return Build;
    }

    public void setBuild(String Build) {
        this.Build = Build;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getVariety() {
        return Variety;
    }

    public void setVariety(String Variety) {
        this.Variety = Variety;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getAcceptNum() {
        return AcceptNum;
    }

    public void setAcceptNum(String AcceptNum) {
        this.AcceptNum = AcceptNum;
    }

    public String getChipNum() {
        return ChipNum;
    }

    public void setChipNum(String ChipNum) {
        this.ChipNum = ChipNum;
    }

    public String getIsSterilization() {
        return IsSterilization;
    }

    public void setIsSterilization(String IsSterilization) {
        this.IsSterilization = IsSterilization;
    }

    public String getHairType() {
        return HairType;
    }

    public void setHairType(String HairType) {
        this.HairType = HairType;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public String getResettlement() {
        return Resettlement;
    }

    public void setResettlement(String Resettlement) {
        this.Resettlement = Resettlement;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getChildreAnlong() {
        return ChildreAnlong;
    }

    public void setChildreAnlong(String ChildreAnlong) {
        this.ChildreAnlong = ChildreAnlong;
    }

    public String getAnimalAnlong() {
        return AnimalAnlong;
    }

    public void setAnimalAnlong(String AnimalAnlong) {
        this.AnimalAnlong = AnimalAnlong;
    }

    public String getBodyweight() {
        return Bodyweight;
    }

    public void setBodyweight(String Bodyweight) {
        this.Bodyweight = Bodyweight;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_id);
        dest.writeString(Name);
        dest.writeString(Sex);
        dest.writeString(Type);
        dest.writeString(Build);
        dest.writeString(Age);
        dest.writeString(Variety);
        dest.writeString(Reason);
        dest.writeString(AcceptNum);
        dest.writeString(ChipNum);
        dest.writeString(IsSterilization);
        dest.writeString(HairType);
        dest.writeString(Note);
        dest.writeString(Resettlement);
        dest.writeString(Phone);
        dest.writeString(Email);
        dest.writeString(ChildreAnlong);
        dest.writeString(AnimalAnlong);
        dest.writeString(Bodyweight);
        dest.writeString(ImageName);
    }
}
