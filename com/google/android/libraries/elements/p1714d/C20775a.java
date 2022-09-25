package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.elements.d.a */
/* compiled from: PG */
final class C20775a extends C20808au {

    /* renamed from: a */
    public final C21357r f58115a;

    /* renamed from: b */
    public final C21357r f58116b;

    /* renamed from: c */
    public final C21357r f58117c;

    /* renamed from: d */
    public final C21357r f58118d;

    /* renamed from: e */
    public final C21296cl f58119e;

    /* renamed from: f */
    public final C21259bb f58120f;

    /* renamed from: g */
    public final boolean f58121g;

    /* renamed from: h */
    public final C21313t f58122h;

    /* renamed from: i */
    public final C58495hd f58123i;

    /* renamed from: j */
    public final C21319z f58124j;

    public C20775a(C21357r rVar, C21357r rVar2, C21357r rVar3, C21357r rVar4, C21296cl clVar, C21259bb bbVar, boolean z, C21313t tVar, C58495hd hdVar, C21319z zVar) {
        this.f58115a = rVar;
        this.f58116b = rVar2;
        this.f58117c = rVar3;
        this.f58118d = rVar4;
        if (clVar != null) {
            this.f58119e = clVar;
            if (bbVar != null) {
                this.f58120f = bbVar;
                this.f58121g = z;
                if (tVar != null) {
                    this.f58122h = tVar;
                    if (hdVar != null) {
                        this.f58123i = hdVar;
                        if (zVar != null) {
                            this.f58124j = zVar;
                            return;
                        }
                        throw new NullPointerException("Null conversionContext");
                    }
                    throw new NullPointerException("Null styleRunExtensionConverters");
                }
                throw new NullPointerException("Null commandResolver");
            }
            throw new NullPointerException("Null logger");
        }
        throw new NullPointerException("Null typefaceProvider");
    }

    /* renamed from: a */
    public final C21313t mo25842a() {
        return this.f58122h;
    }

    /* renamed from: b */
    public final C21319z mo25843b() {
        return this.f58124j;
    }

    /* renamed from: c */
    public final C21259bb mo25844c() {
        return this.f58120f;
    }

    /* renamed from: d */
    public final C21296cl mo25845d() {
        return this.f58119e;
    }

    /* renamed from: e */
    public final C21357r mo25846e() {
        return this.f58117c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20808au) {
            C20808au auVar = (C20808au) obj;
            C21357r rVar = this.f58115a;
            if (rVar != null ? rVar.equals(auVar.mo25848f()) : auVar.mo25848f() == null) {
                C21357r rVar2 = this.f58116b;
                if (rVar2 != null ? rVar2.equals(auVar.mo25849g()) : auVar.mo25849g() == null) {
                    C21357r rVar3 = this.f58117c;
                    if (rVar3 != null ? rVar3.equals(auVar.mo25846e()) : auVar.mo25846e() == null) {
                        C21357r rVar4 = this.f58118d;
                        if (rVar4 != null ? rVar4.equals(auVar.mo25850h()) : auVar.mo25850h() == null) {
                            return this.f58119e.equals(auVar.mo25845d()) && this.f58120f.equals(auVar.mo25844c()) && this.f58121g == auVar.mo25853j() && this.f58122h.equals(auVar.mo25842a()) && this.f58123i.equals(auVar.mo25852i()) && this.f58124j.equals(auVar.mo25843b());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final C21357r mo25848f() {
        return this.f58115a;
    }

    /* renamed from: g */
    public final C21357r mo25849g() {
        return this.f58116b;
    }

    /* renamed from: h */
    public final C21357r mo25850h() {
        return this.f58118d;
    }

    /* renamed from: i */
    public final C58495hd mo25852i() {
        return this.f58123i;
    }

    /* renamed from: j */
    public final boolean mo25853j() {
        return this.f58121g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f58115a);
        String valueOf2 = String.valueOf(this.f58116b);
        String valueOf3 = String.valueOf(this.f58117c);
        String valueOf4 = String.valueOf(this.f58118d);
        String obj = this.f58119e.toString();
        String obj2 = this.f58120f.toString();
        boolean z = this.f58121g;
        String obj3 = this.f58122h.toString();
        String obj4 = this.f58123i.toString();
        String obj5 = this.f58124j.toString();
        return "PropArgs{onChangeCommandFuture=" + valueOf + ", onFocusCommandFuture=" + valueOf2 + ", onBlurCommandFuture=" + valueOf3 + ", onTextInputActionCommandFuture=" + valueOf4 + ", typefaceProvider=" + obj + ", logger=" + obj2 + ", enableEmojiCompat=" + z + ", commandResolver=" + obj3 + ", styleRunExtensionConverters=" + obj4 + ", conversionContext=" + obj5 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C21357r rVar = this.f58115a;
        int i4 = 0;
        if (rVar == null) {
            i = 0;
        } else {
            i = rVar.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        C21357r rVar2 = this.f58116b;
        if (rVar2 == null) {
            i2 = 0;
        } else {
            i2 = rVar2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        C21357r rVar3 = this.f58117c;
        if (rVar3 == null) {
            i3 = 0;
        } else {
            i3 = rVar3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        C21357r rVar4 = this.f58118d;
        if (rVar4 != null) {
            i4 = rVar4.hashCode();
        }
        return ((((((((((((i7 ^ i4) * 1000003) ^ this.f58119e.hashCode()) * 1000003) ^ this.f58120f.hashCode()) * 1000003) ^ (true != this.f58121g ? 1237 : 1231)) * 1000003) ^ this.f58122h.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f58123i.entrySet())) * 1000003) ^ this.f58124j.hashCode();
    }
}
