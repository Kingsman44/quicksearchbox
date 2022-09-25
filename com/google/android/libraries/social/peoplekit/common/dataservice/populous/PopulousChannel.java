package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.social.p3269d.p3270a.C41934i;
import com.google.android.libraries.social.p3269d.p3270a.C41941p;
import com.google.android.libraries.social.p3269d.p3270a.C41949x;
import com.google.android.libraries.social.peoplekit.PeopleKitPerson;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42092b;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitExternalEntityKey;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.core.C42282bh;
import com.google.android.libraries.social.populous.core.C42289bo;
import com.google.android.libraries.social.populous.core.C42298bx;
import com.google.android.libraries.social.populous.core.C42318cq;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.C42344e;
import com.google.android.libraries.social.populous.core.C42346g;
import com.google.android.libraries.social.populous.core.C42347h;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class PopulousChannel implements Channel {
    public static final Parcelable.Creator CREATOR = new C42110d();

    /* renamed from: A */
    private Loggable f110068A;

    /* renamed from: B */
    private final PopulousGroup f110069B;

    /* renamed from: C */
    private int f110070C;

    /* renamed from: D */
    private int f110071D;

    /* renamed from: a */
    public final String f110072a;

    /* renamed from: b */
    public final int f110073b;

    /* renamed from: c */
    public String f110074c;

    /* renamed from: d */
    public String f110075d;

    /* renamed from: e */
    public String f110076e;

    /* renamed from: f */
    public String f110077f;

    /* renamed from: g */
    public final String f110078g;

    /* renamed from: h */
    public final String f110079h;

    /* renamed from: i */
    public final String f110080i;

    /* renamed from: j */
    public final PopulousPerson f110081j;

    /* renamed from: k */
    private final int f110082k;

    /* renamed from: l */
    private String f110083l;

    /* renamed from: m */
    private final AutocompleteMatchInfo f110084m;

    /* renamed from: n */
    private String f110085n;

    /* renamed from: o */
    private final AutocompleteMatchInfo f110086o;

    /* renamed from: p */
    private boolean f110087p;

    /* renamed from: q */
    private boolean f110088q;

    /* renamed from: r */
    private boolean f110089r;

    /* renamed from: s */
    private String f110090s;

    /* renamed from: t */
    private final boolean f110091t;

    /* renamed from: u */
    private final boolean f110092u;

    /* renamed from: v */
    private final boolean f110093v;

    /* renamed from: w */
    private final List f110094w;

    /* renamed from: x */
    private final boolean f110095x;

    /* renamed from: y */
    private final String f110096y;

    /* renamed from: z */
    private final int f110097z;

    public PopulousChannel(Parcel parcel) {
        this.f110082k = parcel.readInt();
        this.f110083l = parcel.readString();
        this.f110072a = parcel.readString();
        int readInt = parcel.readInt();
        this.f110073b = readInt;
        this.f110084m = (AutocompleteMatchInfo) parcel.readParcelable(AutocompleteMatchInfo.class.getClassLoader());
        this.f110085n = parcel.readString();
        this.f110074c = parcel.readString();
        this.f110075d = parcel.readString();
        this.f110086o = (AutocompleteMatchInfo) parcel.readParcelable(AutocompleteMatchInfo.class.getClassLoader());
        boolean z = false;
        this.f110087p = parcel.readInt() == 1;
        this.f110088q = parcel.readInt() == 1;
        this.f110089r = parcel.readInt() == 1;
        this.f110076e = parcel.readString();
        this.f110077f = parcel.readString();
        this.f110090s = parcel.readString();
        this.f110078g = parcel.readString();
        this.f110091t = parcel.readInt() == 1;
        this.f110092u = parcel.readInt() == 1;
        this.f110093v = parcel.readInt() == 1;
        ArrayList arrayList = new ArrayList();
        this.f110094w = arrayList;
        parcel.readTypedList(arrayList, PeopleKitExternalEntityKey.CREATOR);
        this.f110095x = parcel.readInt() == 1 ? true : z;
        this.f110079h = parcel.readString();
        this.f110080i = parcel.readString();
        this.f110096y = parcel.readString();
        this.f110097z = parcel.readInt();
        this.f110081j = (PopulousPerson) parcel.readParcelable(PopulousPerson.class.getClassLoader());
        this.f110069B = (PopulousGroup) parcel.readParcelable(PopulousGroup.class.getClassLoader());
        switch (readInt) {
            case 1:
                this.f110068A = (Loggable) parcel.readParcelable(Email.class.getClassLoader());
                break;
            case 2:
                this.f110068A = (Loggable) parcel.readParcelable(Phone.class.getClassLoader());
                break;
            case 3:
            case 4:
            case 5:
                this.f110068A = (Loggable) parcel.readParcelable(InAppNotificationTarget.class.getClassLoader());
                break;
            case 6:
                this.f110068A = (Loggable) parcel.readParcelable(Group.class.getClassLoader());
                break;
            default:
                throw new IllegalArgumentException("Cannot create ContactMethodField of unknown type: " + readInt);
        }
        this.f110071D = C41934i.m73458a(parcel.readInt());
        this.f110070C = C41941p.m73462a(parcel.readInt());
    }

    public PopulousChannel(C42111e eVar) {
        this.f110082k = eVar.f110129a;
        this.f110072a = eVar.f110130b;
        this.f110073b = eVar.f110131c;
        this.f110084m = eVar.f110132d;
        this.f110074c = eVar.f110133e;
        this.f110075d = eVar.f110134f;
        this.f110086o = eVar.f110137i;
        this.f110087p = eVar.f110135g;
        this.f110088q = eVar.f110136h;
        this.f110076e = eVar.f110138j;
        this.f110077f = eVar.f110139k;
        this.f110090s = eVar.f110140l;
        this.f110078g = eVar.f110141m;
        this.f110091t = eVar.f110142n;
        this.f110092u = eVar.f110143o;
        this.f110093v = eVar.f110144p;
        this.f110071D = eVar.f110127A;
        this.f110070C = eVar.f110128B;
        this.f110094w = eVar.f110145q;
        this.f110095x = eVar.f110146r;
        this.f110079h = eVar.f110147s;
        this.f110080i = eVar.f110148t;
        this.f110096y = eVar.f110149u;
        this.f110097z = eVar.f110150v;
        this.f110068A = eVar.f110154z;
        this.f110081j = eVar.f110152x;
        this.f110069B = eVar.f110153y;
        if (mo44611C()) {
            this.f110083l = eVar.f110151w;
        }
    }

    /* renamed from: A */
    public final boolean mo44609A() {
        return this.f110095x;
    }

    /* renamed from: B */
    public final boolean mo44610B() {
        return this.f110093v;
    }

    /* renamed from: C */
    public final boolean mo44611C() {
        int i = this.f110073b;
        return i == 5 || i == 3 || i == 4;
    }

    /* renamed from: D */
    public final boolean mo44612D() {
        return this.f110089r;
    }

    /* renamed from: E */
    public final boolean mo44613E() {
        return this.f110091t;
    }

    /* renamed from: F */
    public final boolean mo44614F() {
        return this.f110092u;
    }

    /* renamed from: G */
    public final void mo44615G() {
        this.f110089r = true;
    }

    /* renamed from: H */
    public final int mo44616H() {
        return this.f110071D;
    }

    /* renamed from: I */
    public final int mo44617I() {
        return this.f110070C;
    }

    /* renamed from: J */
    public final void mo44618J(int i) {
        this.f110071D = i;
    }

    /* renamed from: K */
    public final void mo44619K(int i) {
        this.f110070C = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final Loggable mo44697L() {
        if (this.f110068A == null) {
            C42318cq cqVar = new C42318cq();
            int i = this.f110082k;
            if (i == 1) {
                cqVar.f110981h.add(C42331dc.USER_ENTERED);
            } else if (i == 4) {
                cqVar.f110981h.add(C42331dc.DEVICE);
                cqVar.f110985l = true;
            } else if (i == 5) {
                cqVar.f110981h.add(C42331dc.PREPOPULATED);
            } else if (i == 6) {
                cqVar.f110981h.add(C42331dc.SMART_ADDRESS_EXPANSION);
            } else if (i == 7) {
                cqVar.f110981h.add(C42331dc.SMART_ADDRESS_REPLACEMENT);
            }
            PersonFieldMetadata a = cqVar.mo45296a();
            int i2 = this.f110073b;
            if (i2 == 1) {
                C42289bo h = Email.m74331h();
                h.mo45249g(this.f110072a);
                ((C42344e) h).f111048a = a;
                this.f110068A = h.mo45250h();
            } else if (i2 == 2) {
                C42347h hVar = new C42347h();
                hVar.mo45303d(this.f110072a);
                hVar.f111067b = a;
                this.f110068A = hVar.mo45304g();
            } else if (i2 == 3) {
                C42298bx o = InAppNotificationTarget.m74363o();
                o.mo45262h(C42282bh.IN_APP_GAIA);
                o.mo45263i(this.f110072a);
                ((C42346g) o).f111058a = a;
                this.f110068A = o.mo45264j();
            } else if (i2 == 4) {
                C42298bx o2 = InAppNotificationTarget.m74363o();
                o2.mo45262h(C42282bh.IN_APP_PHONE);
                o2.mo45263i(this.f110072a);
                ((C42346g) o2).f111058a = a;
                this.f110068A = o2.mo45264j();
            } else if (i2 == 5) {
                C42298bx o3 = InAppNotificationTarget.m74363o();
                o3.mo45262h(C42282bh.IN_APP_EMAIL);
                o3.mo45263i(this.f110072a);
                ((C42346g) o3).f111058a = a;
                this.f110068A = o3.mo45264j();
            }
        }
        return this.f110068A;
    }

    /* renamed from: a */
    public final int mo44620a() {
        return this.f110082k;
    }

    /* renamed from: b */
    public final int mo44621b() {
        return this.f110073b;
    }

    /* renamed from: c */
    public final int mo44622c() {
        return this.f110097z;
    }

    /* renamed from: d */
    public final /* synthetic */ PeopleKitPerson mo44623d() {
        return this.f110081j;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final AutocompleteMatchInfo mo44624e() {
        return this.f110084m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Channel) {
            return C42096f.m73801f(this, (Channel) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final AutocompleteMatchInfo mo44625f() {
        return this.f110086o;
    }

    /* renamed from: g */
    public final C41949x mo44626g(Context context) {
        return C42096f.m73796a(this, context);
    }

    /* renamed from: h */
    public final String mo44627h() {
        return this.f110072a;
    }

    public final int hashCode() {
        return C42096f.m73799d(this).hashCode();
    }

    /* renamed from: i */
    public final String mo44628i() {
        return this.f110079h;
    }

    /* renamed from: j */
    public final String mo44629j() {
        return this.f110080i;
    }

    /* renamed from: k */
    public final String mo44630k(Context context) {
        if (TextUtils.isEmpty(this.f110083l)) {
            int i = this.f110073b;
            if (i == 6) {
                return null;
            }
            this.f110083l = (i == 2 || i == 4) ? C42092b.m73791c(this.f110072a, context) : this.f110072a;
        }
        return this.f110083l;
    }

    /* renamed from: l */
    public final String mo44631l(Context context) {
        String str;
        if (TextUtils.isEmpty(this.f110085n)) {
            if (!TextUtils.isEmpty(this.f110074c)) {
                this.f110085n = this.f110074c;
            } else {
                int i = this.f110073b;
                if (i == 6) {
                    return null;
                }
                if (i == 3) {
                    this.f110085n = this.f110097z == 2 ? C42092b.m73791c(this.f110096y, context) : this.f110096y;
                } else {
                    if (i == 4) {
                        str = C42092b.m73791c(this.f110072a, context);
                    } else if (i == 5) {
                        str = this.f110072a;
                    } else {
                        this.f110085n = mo44630k(context);
                    }
                    this.f110085n = str;
                }
            }
        }
        return this.f110085n;
    }

    /* renamed from: m */
    public final String mo44632m() {
        return this.f110075d;
    }

    /* renamed from: n */
    public final String mo44633n() {
        return this.f110078g;
    }

    /* renamed from: o */
    public final String mo44634o() {
        return this.f110076e;
    }

    /* renamed from: p */
    public final String mo44635p() {
        return this.f110074c;
    }

    /* renamed from: q */
    public final String mo44636q() {
        return this.f110090s;
    }

    /* renamed from: r */
    public final String mo44637r() {
        return this.f110096y;
    }

    /* renamed from: s */
    public final String mo44638s() {
        return this.f110077f;
    }

    /* renamed from: t */
    public final void mo44639t(String str) {
        this.f110075d = str;
    }

    public final String toString() {
        String str = this.f110072a;
        int i = this.f110073b;
        String str2 = this.f110074c;
        String str3 = this.f110075d;
        String str4 = this.f110076e;
        String str5 = this.f110077f;
        String str6 = this.f110090s;
        String str7 = this.f110096y;
        int i2 = this.f110097z;
        return str + " <" + i + "> " + str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6 + " <" + str7 + "> " + i2;
    }

    /* renamed from: u */
    public final void mo44640u(String str) {
        this.f110076e = str;
    }

    /* renamed from: v */
    public final void mo44641v(String str, boolean z, boolean z2) {
        this.f110074c = str;
        this.f110087p = z;
        this.f110088q = z2;
        this.f110085n = null;
    }

    /* renamed from: w */
    public final void mo44642w(String str) {
        this.f110090s = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110082k);
        parcel.writeString(this.f110083l);
        parcel.writeString(this.f110072a);
        parcel.writeInt(this.f110073b);
        parcel.writeParcelable(this.f110084m, i);
        parcel.writeString(this.f110085n);
        parcel.writeString(this.f110074c);
        parcel.writeString(this.f110075d);
        parcel.writeParcelable(this.f110086o, i);
        parcel.writeByte(this.f110087p ? (byte) 1 : 0);
        parcel.writeByte(this.f110088q ? (byte) 1 : 0);
        parcel.writeByte(this.f110089r ? (byte) 1 : 0);
        parcel.writeString(this.f110076e);
        parcel.writeString(this.f110077f);
        parcel.writeString(this.f110090s);
        parcel.writeString(this.f110078g);
        parcel.writeByte(this.f110091t ? (byte) 1 : 0);
        parcel.writeByte(this.f110092u ? (byte) 1 : 0);
        parcel.writeInt(this.f110093v ? 1 : 0);
        parcel.writeTypedList(this.f110094w);
        parcel.writeInt(this.f110095x ? 1 : 0);
        parcel.writeString(this.f110079h);
        parcel.writeString(this.f110080i);
        parcel.writeString(this.f110096y);
        parcel.writeInt(this.f110097z);
        parcel.writeParcelable(this.f110081j, i);
        parcel.writeParcelable(this.f110069B, i);
        parcel.writeParcelable(this.f110068A, i);
        int i2 = this.f110071D;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(i2 - 1);
        }
        int i3 = this.f110070C;
        if (i3 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(i3 - 1);
        }
    }

    /* renamed from: x */
    public final void mo44643x(String str) {
        this.f110077f = str;
    }

    /* renamed from: y */
    public final boolean mo44644y() {
        return this.f110087p;
    }

    /* renamed from: z */
    public final boolean mo44645z() {
        return this.f110088q;
    }
}
