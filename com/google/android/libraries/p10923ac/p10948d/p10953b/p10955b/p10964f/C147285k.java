package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146808e;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146846ap;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147275e;
import com.google.protobuf.MessageLite;
import com.google.protos.p4895aw.p4902b.C63984au;
import com.google.protos.p4895aw.p4902b.C63985av;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.k */
/* compiled from: PG */
final class C147285k implements C146846ap {

    /* renamed from: a */
    private final C147275e f397543a;

    /* renamed from: b */
    private int f397544b = 1;

    public C147285k(C147275e eVar) {
        this.f397543a = eVar;
    }

    /* renamed from: a */
    public final void mo123753a() {
    }

    /* renamed from: b */
    public final int mo123754b() {
        return this.f397544b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo123755c(MessageLite messageLite) {
        C63985av avVar = (C63985av) messageLite;
        int i = this.f397544b;
        if (i != 1) {
            return i;
        }
        int a = C63984au.m96331a(avVar.f173042b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            this.f397544b = 2;
            return 2;
        }
        C147275e eVar = this.f397543a;
        new C146808e(avVar.f173043c.mo59174N(), (avVar.f173041a & 4) != 0 ? avVar.f173044d.mo59174N() : null, avVar.f173045e);
        eVar.mo124079c();
        return this.f397544b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ int mo123756d(Object obj, Object obj2) {
        C146815l lVar = (C146815l) obj;
        List list = (List) obj2;
        this.f397543a.mo124077a();
        this.f397544b = 1;
        return 1;
    }

    /* renamed from: e */
    public final int mo123757e(C146801h hVar) {
        int i = this.f397544b;
        if (i != 1) {
            return i;
        }
        this.f397543a.mo124078b();
        return this.f397544b;
    }
}
