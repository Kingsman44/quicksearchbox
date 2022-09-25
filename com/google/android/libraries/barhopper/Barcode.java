package com.google.android.libraries.barhopper;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;

/* compiled from: PG */
public class Barcode implements Parcelable {
    public static final int AZTEC = 4096;
    public static final int BOARDING_PASS = 13;
    public static final int CALENDAR_EVENT = 11;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int CONTACT_INFO = 1;
    public static final Parcelable.Creator CREATOR = new C19669a();
    public static final int DATA_MATRIX = 16;
    public static final int DRIVER_LICENSE = 12;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int EMAIL = 2;
    public static final int GEO = 10;
    public static final int ISBN = 3;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int PHONE = 4;
    public static final int PRODUCT = 5;
    public static final int QR_CODE = 256;
    public static final int SMS = 6;
    public static final int TEXT = 7;
    public static final int TEZ_CODE = 32768;
    public static final int UNKNOWN_FORMAT = 0;
    public static final int UNRECOGNIZED = 0;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;
    public static final int URL = 8;
    public static final int WIFI = 9;
    public BoardingPass boardingPass;
    public CalendarEvent calendarEvent;
    public double confidenceScore;
    public ContactInfo contactInfo;
    public Point[] cornerPoints;
    public String displayValue;
    public DriverLicense driverLicense;
    public Email email;
    public int format;
    public GeoPoint geoPoint;
    public boolean isRecognized;
    public Phone phone;
    public byte[] rawBytes;
    public String rawValue;
    public Sms sms;
    public UrlBookmark url;
    public int valueFormat;
    public WiFi wifi;

    /* compiled from: PG */
    public class Address implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19670b();
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public String[] addressLines;
        public int type;

        public Address() {
        }

        private Address(Parcel parcel) {
            this.type = parcel.readInt();
            this.addressLines = parcel.createStringArray();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeStringArray(this.addressLines);
        }
    }

    /* compiled from: PG */
    public class BoardingPass implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19671c();
        public FlightSegment[] flightSegment;
        public String passengerName;

        public BoardingPass() {
        }

        private BoardingPass(Parcel parcel) {
            this.passengerName = parcel.readString();
            this.flightSegment = (FlightSegment[]) parcel.createTypedArray(FlightSegment.CREATOR);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.passengerName);
            parcel.writeTypedArray(this.flightSegment, 0);
        }
    }

    /* compiled from: PG */
    public class CalendarDateTime implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19672d();
        public int day;
        public int hours;
        public boolean isUtc;
        public int minutes;
        public int month;
        public String rawValue;
        public int seconds;
        public int year;

        public CalendarDateTime() {
        }

        private CalendarDateTime(Parcel parcel) {
            this.year = parcel.readInt();
            this.month = parcel.readInt();
            this.day = parcel.readInt();
            this.hours = parcel.readInt();
            this.minutes = parcel.readInt();
            this.seconds = parcel.readInt();
            this.isUtc = parcel.readByte() != 0;
            this.rawValue = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.year);
            parcel.writeInt(this.month);
            parcel.writeInt(this.day);
            parcel.writeInt(this.hours);
            parcel.writeInt(this.minutes);
            parcel.writeInt(this.seconds);
            parcel.writeByte(this.isUtc ? (byte) 1 : 0);
            parcel.writeString(this.rawValue);
        }
    }

    /* compiled from: PG */
    public class CalendarEvent implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19673e();
        public String description;
        public CalendarDateTime end;
        public String location;
        public String organizer;
        public CalendarDateTime start;
        public String status;
        public String summary;

        public CalendarEvent() {
        }

        private CalendarEvent(Parcel parcel) {
            this.summary = parcel.readString();
            this.description = parcel.readString();
            this.location = parcel.readString();
            this.organizer = parcel.readString();
            this.status = parcel.readString();
            this.start = (CalendarDateTime) parcel.readParcelable(CalendarDateTime.class.getClassLoader());
            this.end = (CalendarDateTime) parcel.readParcelable(CalendarDateTime.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.summary);
            parcel.writeString(this.description);
            parcel.writeString(this.location);
            parcel.writeString(this.organizer);
            parcel.writeString(this.status);
            parcel.writeParcelable(this.start, 0);
            parcel.writeParcelable(this.end, 0);
        }
    }

    /* compiled from: PG */
    public class ContactInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19674f();
        public Address[] addresses;
        public Email[] emails;
        public PersonName name;
        public String note;
        public String organization;
        public Phone[] phones;
        public String title;
        public String[] urls;

        public ContactInfo() {
        }

        private ContactInfo(Parcel parcel) {
            this.name = (PersonName) parcel.readParcelable(PersonName.class.getClassLoader());
            this.organization = parcel.readString();
            this.title = parcel.readString();
            this.phones = (Phone[]) parcel.createTypedArray(Phone.CREATOR);
            this.emails = (Email[]) parcel.createTypedArray(Email.CREATOR);
            this.urls = parcel.createStringArray();
            this.addresses = (Address[]) parcel.createTypedArray(Address.CREATOR);
            this.note = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.name, 0);
            parcel.writeString(this.organization);
            parcel.writeString(this.title);
            parcel.writeTypedArray(this.phones, 0);
            parcel.writeTypedArray(this.emails, 0);
            parcel.writeStringArray(this.urls);
            parcel.writeTypedArray(this.addresses, 0);
            parcel.writeString(this.note);
        }
    }

    /* compiled from: PG */
    public class DriverLicense implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19675g();
        public String addressCity;
        public String addressState;
        public String addressStreet;
        public String addressZip;
        public String birthDate;
        public String documentType;
        public String expiryDate;
        public String firstName;
        public String gender;
        public String issueDate;
        public String issuingCountry;
        public String lastName;
        public String licenseNumber;
        public String middleName;

        public DriverLicense() {
        }

        private DriverLicense(Parcel parcel) {
            this.documentType = parcel.readString();
            this.firstName = parcel.readString();
            this.middleName = parcel.readString();
            this.lastName = parcel.readString();
            this.gender = parcel.readString();
            this.addressStreet = parcel.readString();
            this.addressCity = parcel.readString();
            this.addressState = parcel.readString();
            this.addressZip = parcel.readString();
            this.licenseNumber = parcel.readString();
            this.issueDate = parcel.readString();
            this.expiryDate = parcel.readString();
            this.birthDate = parcel.readString();
            this.issuingCountry = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.documentType);
            parcel.writeString(this.firstName);
            parcel.writeString(this.middleName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.gender);
            parcel.writeString(this.addressStreet);
            parcel.writeString(this.addressCity);
            parcel.writeString(this.addressState);
            parcel.writeString(this.addressZip);
            parcel.writeString(this.licenseNumber);
            parcel.writeString(this.issueDate);
            parcel.writeString(this.expiryDate);
            parcel.writeString(this.birthDate);
            parcel.writeString(this.issuingCountry);
        }
    }

    /* compiled from: PG */
    public class Email implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19676h();
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public String address;
        public String body;
        public String subject;
        public int type;

        public Email() {
        }

        private Email(Parcel parcel) {
            this.type = parcel.readInt();
            this.address = parcel.readString();
            this.subject = parcel.readString();
            this.body = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeString(this.address);
            parcel.writeString(this.subject);
            parcel.writeString(this.body);
        }
    }

    /* compiled from: PG */
    public class FlightSegment implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19677i();
        public String carrier;
        public String compartmentCode;
        public String dateOfFlightJulian;
        public String destination;
        public String flightNumber;
        public String origin;
        public String pnrCode;
        public String seatNumber;
        public String selecteeIndicator;

        public FlightSegment() {
        }

        private FlightSegment(Parcel parcel) {
            this.pnrCode = parcel.readString();
            this.origin = parcel.readString();
            this.destination = parcel.readString();
            this.carrier = parcel.readString();
            this.flightNumber = parcel.readString();
            this.dateOfFlightJulian = parcel.readString();
            this.compartmentCode = parcel.readString();
            this.seatNumber = parcel.readString();
            this.selecteeIndicator = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.pnrCode);
            parcel.writeString(this.origin);
            parcel.writeString(this.destination);
            parcel.writeString(this.carrier);
            parcel.writeString(this.flightNumber);
            parcel.writeString(this.dateOfFlightJulian);
            parcel.writeString(this.compartmentCode);
            parcel.writeString(this.seatNumber);
            parcel.writeString(this.selecteeIndicator);
        }
    }

    /* compiled from: PG */
    public class GeoPoint implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19678j();
        public double lat;
        public double lng;

        public GeoPoint() {
        }

        private GeoPoint(Parcel parcel) {
            this.lat = parcel.readDouble();
            this.lng = parcel.readDouble();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.lat);
            parcel.writeDouble(this.lng);
        }
    }

    /* compiled from: PG */
    public class PersonName implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19679k();
        public String first;
        public String formattedName;
        public String last;
        public String middle;
        public String prefix;
        public String pronunciation;
        public String suffix;

        public PersonName() {
        }

        private PersonName(Parcel parcel) {
            this.formattedName = parcel.readString();
            this.pronunciation = parcel.readString();
            this.prefix = parcel.readString();
            this.first = parcel.readString();
            this.middle = parcel.readString();
            this.last = parcel.readString();
            this.suffix = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.formattedName);
            parcel.writeString(this.pronunciation);
            parcel.writeString(this.prefix);
            parcel.writeString(this.first);
            parcel.writeString(this.middle);
            parcel.writeString(this.last);
            parcel.writeString(this.suffix);
        }
    }

    /* compiled from: PG */
    public class Phone implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19680l();
        public static final int FAX = 3;
        public static final int HOME = 2;
        public static final int MOBILE = 4;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public String number;
        public int type;

        public Phone() {
        }

        private Phone(Parcel parcel) {
            this.type = parcel.readInt();
            this.number = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeString(this.number);
        }
    }

    /* compiled from: PG */
    public class Sms implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19681m();
        public String message;
        public String phoneNumber;

        public Sms() {
        }

        private Sms(Parcel parcel) {
            this.message = parcel.readString();
            this.phoneNumber = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
            parcel.writeString(this.phoneNumber);
        }
    }

    /* compiled from: PG */
    public class UrlBookmark implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19682n();
        public String title;
        public String url;

        public UrlBookmark() {
        }

        private UrlBookmark(Parcel parcel) {
            this.title = parcel.readString();
            this.url = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: PG */
    public class WiFi implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C19683o();
        public static final int OPEN = 1;
        public static final int WEP = 3;
        public static final int WPA = 2;
        public int encryptionType;
        public boolean isHidden;
        public String password;
        public String ssid;

        public WiFi() {
        }

        private WiFi(Parcel parcel) {
            this.ssid = parcel.readString();
            this.password = parcel.readString();
            this.encryptionType = parcel.readInt();
            this.isHidden = parcel.readByte() != 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.ssid);
            parcel.writeString(this.password);
            parcel.writeInt(this.encryptionType);
            parcel.writeByte(this.isHidden ? (byte) 1 : 0);
        }
    }

    public Barcode() {
    }

    private Barcode(Parcel parcel) {
        this.format = parcel.readInt();
        this.rawValue = parcel.readString();
        this.displayValue = parcel.readString();
        this.valueFormat = parcel.readInt();
        this.cornerPoints = (Point[]) parcel.createTypedArray(Point.CREATOR);
        this.email = (Email) parcel.readParcelable(Email.class.getClassLoader());
        this.phone = (Phone) parcel.readParcelable(Phone.class.getClassLoader());
        this.sms = (Sms) parcel.readParcelable(Sms.class.getClassLoader());
        this.wifi = (WiFi) parcel.readParcelable(WiFi.class.getClassLoader());
        this.url = (UrlBookmark) parcel.readParcelable(UrlBookmark.class.getClassLoader());
        this.geoPoint = (GeoPoint) parcel.readParcelable(GeoPoint.class.getClassLoader());
        this.calendarEvent = (CalendarEvent) parcel.readParcelable(CalendarEvent.class.getClassLoader());
        this.contactInfo = (ContactInfo) parcel.readParcelable(ContactInfo.class.getClassLoader());
        this.driverLicense = (DriverLicense) parcel.readParcelable(DriverLicense.class.getClassLoader());
        this.boardingPass = (BoardingPass) parcel.readParcelable(BoardingPass.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public Rect getBoundingBox() {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = LinearLayoutManager.INVALID_OFFSET;
        int i4 = LinearLayoutManager.INVALID_OFFSET;
        int i5 = 0;
        while (true) {
            Point[] pointArr = this.cornerPoints;
            if (i5 >= pointArr.length) {
                return new Rect(i, i2, i3, i4);
            }
            Point point = pointArr[i5];
            i = Math.min(i, point.x);
            i3 = Math.max(i3, point.x);
            i2 = Math.min(i2, point.y);
            i4 = Math.max(i4, point.y);
            i5++;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.format);
        parcel.writeString(this.rawValue);
        parcel.writeString(this.displayValue);
        parcel.writeInt(this.valueFormat);
        parcel.writeTypedArray(this.cornerPoints, 0);
        parcel.writeParcelable(this.email, 0);
        parcel.writeParcelable(this.phone, 0);
        parcel.writeParcelable(this.sms, 0);
        parcel.writeParcelable(this.wifi, 0);
        parcel.writeParcelable(this.url, 0);
        parcel.writeParcelable(this.geoPoint, 0);
        parcel.writeParcelable(this.calendarEvent, 0);
        parcel.writeParcelable(this.contactInfo, 0);
        parcel.writeParcelable(this.driverLicense, 0);
        parcel.writeParcelable(this.boardingPass, 0);
    }
}
