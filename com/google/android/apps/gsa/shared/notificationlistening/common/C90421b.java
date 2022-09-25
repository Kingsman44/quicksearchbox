package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.b */
/* compiled from: PG */
public abstract class C90421b {

    /* renamed from: a */
    public static final C59071e f252580a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.common.b");

    /* renamed from: b */
    public final String f252581b;

    /* renamed from: c */
    public final Uri f252582c;

    /* renamed from: d */
    public final boolean f252583d;

    /* renamed from: e */
    public final String f252584e;

    /* renamed from: f */
    public final Uri f252585f;

    /* renamed from: g */
    public final Integer f252586g;

    /* renamed from: h */
    public final boolean f252587h;

    /* renamed from: i */
    public final GroupDataKey f252588i;

    /* renamed from: j */
    public final String f252589j;

    /* renamed from: k */
    public final Intent f252590k;

    /* renamed from: l */
    public final String f252591l;

    /* renamed from: m */
    public final long f252592m;

    /* renamed from: n */
    public final long f252593n;

    /* renamed from: o */
    public C90433n f252594o;

    /* renamed from: p */
    public Long f252595p;

    /* renamed from: q */
    public boolean f252596q;

    /* renamed from: r */
    private final C21370a f252597r;

    public C90421b(C90420a aVar) {
        long j;
        String str = aVar.f252565b;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            ((C59052c) ((C59052c) f252580a.mo56226d()).mo56372aa(10932)).mo56386p("App name is required.");
            int i = C90755l.f253831a;
            str = str2;
        }
        this.f252581b = str;
        this.f252583d = aVar.f252566c;
        this.f252582c = aVar.f252567d;
        this.f252584e = aVar.f252568e;
        this.f252585f = aVar.f252569f;
        this.f252586g = aVar.f252570g;
        this.f252587h = aVar.f252571h;
        this.f252588i = aVar.f252572i;
        C21370a aVar2 = aVar.f252564a;
        this.f252597r = aVar2;
        this.f252596q = aVar.f252579p;
        String str3 = aVar.f252573j;
        if (str3 == null) {
            ((C59052c) ((C59052c) f252580a.mo56226d()).mo56372aa(10935)).mo56386p("System notification key is required.");
            int i2 = C90755l.f253831a;
            this.f252589j = str2;
        } else {
            this.f252589j = str3;
        }
        this.f252590k = aVar.f252574k;
        String str4 = aVar.f252575l;
        if (str4 == null) {
            ((C59052c) ((C59052c) f252580a.mo56226d()).mo56372aa(10933)).mo56386p("Package name is required.");
            int i3 = C90755l.f253831a;
        } else {
            str2 = str4;
        }
        this.f252591l = str2;
        Long l = aVar.f252576m;
        if (l == null) {
            ((C59052c) ((C59052c) f252580a.mo56226d()).mo56372aa(10934)).mo56386p("Post time is required.");
            int i4 = C90755l.f253831a;
            j = 0;
            this.f252592m = 0;
        } else {
            j = l.longValue();
            this.f252592m = j;
        }
        Long l2 = aVar.f252578o;
        if (l2 == null) {
            this.f252593n = j;
        } else {
            this.f252593n = l2.longValue();
        }
        this.f252594o = new C90433n(aVar2);
        Long l3 = aVar.f252577n;
        if (l3 != null) {
            this.f252595p = l3;
            this.f252594o.mo84168c(aVar.f252577n.longValue());
        }
    }

    /* renamed from: d */
    static void m147093d(Parcel parcel, C90420a aVar) {
        String readString = parcel.readString();
        String str = BuildConfig.FLAVOR;
        if (readString == null) {
            readString = str;
        }
        aVar.f252565b = readString;
        aVar.f252567d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = false;
        aVar.f252566c = parcel.readByte() != 0;
        aVar.f252568e = parcel.readString();
        aVar.f252569f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() == 1) {
            aVar.f252570g = Integer.valueOf(parcel.readInt());
        }
        aVar.f252571h = parcel.readByte() != 0;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = str;
        }
        aVar.f252573j = readString2;
        aVar.f252574k = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        String readString3 = parcel.readString();
        if (readString3 != null) {
            str = readString3;
        }
        aVar.f252575l = str;
        aVar.f252576m = Long.valueOf(parcel.readLong());
        aVar.f252578o = Long.valueOf(parcel.readLong());
        if (parcel.readByte() == 1) {
            aVar.f252577n = Long.valueOf(parcel.readLong());
        }
        aVar.f252572i = (GroupDataKey) parcel.readParcelable(GroupDataKey.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        }
        aVar.f252579p = z;
    }

    /* renamed from: a */
    public final long mo84144a() {
        Long l = this.f252595p;
        if (l != null) {
            return l.longValue();
        }
        ((C59052c) ((C59052c) f252580a.mo56226d()).mo56372aa(10931)).mo56386p("Storage identifier has not been set!");
        int i = C90755l.f253831a;
        return 0;
    }

    /* renamed from: b */
    public abstract C90427h mo84131b();

    /* renamed from: c */
    public final String mo84145c() {
        String[] split = this.f252589j.split(Pattern.quote("*"));
        int length = split.length;
        if (length == 1) {
            return this.f252589j;
        }
        if (length == 2) {
            return split[0];
        }
        String str = split[0];
        for (int i = 1; i < split.length - 1; i++) {
            str = str + "*" + split[i];
        }
        return str;
    }

    /* renamed from: e */
    public boolean mo84133e(C90421b bVar) {
        if (this != bVar) {
            return (this instanceof MessageNotification) == (bVar instanceof MessageNotification) && (this instanceof C90425f) == (bVar instanceof C90425f) && this.f252581b.equals(bVar.f252581b) && C58832aw.m90831a(this.f252582c, bVar.f252582c) && C58832aw.m90831a(this.f252586g, bVar.f252586g);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo84146f() {
        return this.f252595p != null;
    }

    public String toString() {
        String str = this.f252591l;
        String str2 = this.f252581b;
        boolean z = true;
        boolean z2 = this.f252582c != null;
        boolean z3 = this.f252583d;
        String str3 = this.f252584e;
        boolean z4 = this.f252585f != null;
        Integer num = this.f252586g;
        boolean z5 = this.f252587h;
        String valueOf = String.valueOf(this.f252588i);
        String str4 = this.f252589j;
        if (this.f252590k == null) {
            z = false;
        }
        long j = this.f252592m;
        long j2 = this.f252593n;
        boolean z6 = this.f252596q;
        String valueOf2 = String.valueOf(this.f252594o);
        return "packageName=" + str + ", appName=" + str2 + ", has AudioContents=" + z2 + ", isGroupChild=" + z3 + ", category=" + str3 + ", has Chime=" + z4 + ", contentVersionId=" + num + ", doesAlert=" + z5 + ", groupDataKey=" + valueOf + ", key=" + str4 + ", has onDelivered Intent=" + z + ", postTime=" + j + ", contentCreationTime=" + j2 + ", hasBeenRemoved=" + z6 + ", playbackState=" + valueOf2 + ", storageIdentifier=" + this.f252595p;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252581b);
        parcel.writeParcelable(this.f252582c, i);
        parcel.writeByte(this.f252583d ? (byte) 1 : 0);
        parcel.writeString(this.f252584e);
        parcel.writeParcelable(this.f252585f, i);
        if (this.f252586g == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f252586g.intValue());
        }
        parcel.writeByte(this.f252587h ? (byte) 1 : 0);
        parcel.writeString(this.f252589j);
        parcel.writeParcelable(this.f252590k, i);
        parcel.writeString(this.f252591l);
        parcel.writeLong(this.f252592m);
        parcel.writeLong(this.f252593n);
        if (this.f252595p == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f252595p.longValue());
        }
        parcel.writeParcelable(this.f252588i, i);
        parcel.writeByte(this.f252596q ? (byte) 1 : 0);
    }
}
