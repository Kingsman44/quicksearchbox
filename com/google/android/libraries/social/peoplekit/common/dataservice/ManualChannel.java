package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41934i;
import com.google.android.libraries.social.p3269d.p3270a.C41941p;
import com.google.android.libraries.social.p3269d.p3270a.C41949x;
import com.google.android.libraries.social.peoplekit.PeopleKitPerson;

/* compiled from: PG */
public final class ManualChannel implements Channel {
    public static final Parcelable.Creator CREATOR = new C42099i();

    /* renamed from: a */
    private String f110031a;

    /* renamed from: b */
    private String f110032b;

    /* renamed from: c */
    private String f110033c;

    /* renamed from: d */
    private final String f110034d;

    /* renamed from: e */
    private final int f110035e;

    /* renamed from: f */
    private String f110036f;

    /* renamed from: g */
    private String f110037g;

    /* renamed from: h */
    private String f110038h;

    /* renamed from: i */
    private int f110039i;

    /* renamed from: j */
    private int f110040j;

    public ManualChannel(Parcel parcel) {
        this.f110031a = parcel.readString();
        this.f110033c = parcel.readString();
        this.f110034d = parcel.readString();
        this.f110035e = parcel.readInt();
        this.f110036f = parcel.readString();
        this.f110037g = parcel.readString();
        this.f110038h = parcel.readString();
        this.f110040j = C41934i.m73458a(parcel.readInt());
        this.f110039i = C41941p.m73462a(parcel.readInt());
    }

    public ManualChannel(C42100j jVar) {
        this.f110031a = jVar.f110055a;
        this.f110034d = jVar.f110056b;
        this.f110035e = jVar.f110057c;
        this.f110036f = jVar.f110058d;
        this.f110040j = jVar.f110059e;
        this.f110039i = jVar.f110060f;
    }

    /* renamed from: A */
    public final boolean mo44609A() {
        return false;
    }

    /* renamed from: B */
    public final boolean mo44610B() {
        return false;
    }

    /* renamed from: C */
    public final boolean mo44611C() {
        return false;
    }

    /* renamed from: D */
    public final boolean mo44612D() {
        return false;
    }

    /* renamed from: E */
    public final boolean mo44613E() {
        return false;
    }

    /* renamed from: F */
    public final boolean mo44614F() {
        return false;
    }

    /* renamed from: G */
    public final void mo44615G() {
    }

    /* renamed from: H */
    public final int mo44616H() {
        return this.f110040j;
    }

    /* renamed from: I */
    public final int mo44617I() {
        return this.f110039i;
    }

    /* renamed from: J */
    public final void mo44618J(int i) {
        this.f110040j = i;
    }

    /* renamed from: K */
    public final void mo44619K(int i) {
        this.f110039i = i;
    }

    /* renamed from: a */
    public final int mo44620a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo44621b() {
        return this.f110035e;
    }

    /* renamed from: c */
    public final int mo44622c() {
        return 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ PeopleKitPerson mo44623d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final AutocompleteMatchInfo mo44624e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Channel) {
            return C42096f.m73801f(this, (Channel) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final AutocompleteMatchInfo mo44625f() {
        return null;
    }

    /* renamed from: g */
    public final C41949x mo44626g(Context context) {
        return C42096f.m73796a(this, context);
    }

    /* renamed from: h */
    public final String mo44627h() {
        return this.f110034d;
    }

    public final int hashCode() {
        return C42096f.m73799d(this).hashCode();
    }

    /* renamed from: i */
    public final String mo44628i() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo44629j() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: k */
    public final String mo44630k(Context context) {
        if (TextUtils.isEmpty(this.f110033c)) {
            this.f110033c = this.f110035e == 2 ? C42092b.m73791c(this.f110034d, context) : this.f110034d;
        }
        return this.f110033c;
    }

    /* renamed from: l */
    public final String mo44631l(Context context) {
        if (!TextUtils.isEmpty(this.f110031a)) {
            return this.f110031a;
        }
        return mo44630k(context);
    }

    /* renamed from: m */
    public final String mo44632m() {
        return this.f110032b;
    }

    /* renamed from: n */
    public final String mo44633n() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: o */
    public final String mo44634o() {
        return this.f110036f;
    }

    /* renamed from: p */
    public final String mo44635p() {
        return this.f110031a;
    }

    /* renamed from: q */
    public final String mo44636q() {
        return this.f110038h;
    }

    /* renamed from: r */
    public final String mo44637r() {
        return null;
    }

    /* renamed from: s */
    public final String mo44638s() {
        return this.f110037g;
    }

    /* renamed from: t */
    public final void mo44639t(String str) {
        this.f110032b = str;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f110031a)) {
            String str = this.f110031a;
            int i = this.f110035e;
            return str + " <" + i + ">";
        }
        String str2 = this.f110034d;
        int i2 = this.f110035e;
        return str2 + " <" + i2 + ">";
    }

    /* renamed from: u */
    public final void mo44640u(String str) {
        this.f110036f = str;
    }

    /* renamed from: v */
    public final void mo44641v(String str, boolean z, boolean z2) {
        this.f110031a = str;
    }

    /* renamed from: w */
    public final void mo44642w(String str) {
        this.f110038h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110031a);
        parcel.writeString(this.f110033c);
        parcel.writeString(this.f110034d);
        parcel.writeInt(this.f110035e);
        parcel.writeString(this.f110036f);
        parcel.writeString(this.f110037g);
        parcel.writeString(this.f110038h);
        int i2 = this.f110040j;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            int i4 = this.f110039i;
            int i5 = i4 - 1;
            if (i4 != 0) {
                parcel.writeInt(i5);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: x */
    public final void mo44643x(String str) {
        this.f110037g = str;
    }

    /* renamed from: y */
    public final boolean mo44644y() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo44645z() {
        return false;
    }
}
