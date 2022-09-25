package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97300w;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146808e;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146846ap;
import com.google.android.libraries.p10923ac.p10947c.C147208j;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10959c.p10960a.C147240a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10959c.p10961b.C147242b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.MessageLite;
import com.google.protos.p4895aw.p4902b.C63997bg;
import com.google.protos.p4895aw.p4902b.C63998bh;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.w */
/* compiled from: PG */
final class C147297w implements C146846ap {

    /* renamed from: a */
    private int f397580a = 1;

    /* renamed from: b */
    private final C147294t f397581b;

    public C147297w(C147294t tVar) {
        this.f397581b = tVar;
    }

    /* renamed from: a */
    public final void mo123753a() {
    }

    /* renamed from: b */
    public final int mo123754b() {
        return this.f397580a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo123755c(MessageLite messageLite) {
        C63998bh bhVar = (C63998bh) messageLite;
        int i = this.f397580a;
        if (i != 1) {
            return i;
        }
        int a = C63997bg.m96332a(bhVar.f173070b);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            C147294t tVar = this.f397581b;
            tVar.f397575b.mo90625b(C147242b.m240099b(new C146808e(bhVar.f173071c.mo59174N(), (byte[]) null, bhVar.f173072d), tVar.f397574a));
            return this.f397580a;
        } else if (i2 != 3) {
            this.f397580a = 2;
            return 2;
        } else {
            this.f397581b.f397575b.f271731b.mo80854a(bhVar.f173072d);
            return this.f397580a;
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ int mo123756d(Object obj, Object obj2) {
        C146821r rVar = (C146821r) obj;
        List list = (List) obj2;
        C147294t tVar = this.f397581b;
        C97300w wVar = tVar.f397575b;
        if (rVar != null) {
            C147208j.m240058d(rVar.mo123699a(), rVar.mo123701c(), rVar.mo123700b());
        }
        wVar.mo90626c(C58485gu.m89841i(C58557jl.m90127h(list, new C147293s(tVar))));
        this.f397580a = 1;
        return 1;
    }

    /* renamed from: e */
    public final int mo123757e(C146801h hVar) {
        int i = this.f397580a;
        if (i != 1) {
            return i;
        }
        C147294t tVar = this.f397581b;
        tVar.f397575b.mo90624a(C147240a.m240095a(hVar));
        return this.f397580a;
    }
}
