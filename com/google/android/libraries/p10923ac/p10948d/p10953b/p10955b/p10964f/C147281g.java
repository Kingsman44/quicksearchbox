package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10925b.p10927b.p10928a.C146771a;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146855ay;
import com.google.android.libraries.p10923ac.p10925b.p10934e.p10935a.C146829c;
import com.google.android.libraries.p10923ac.p10925b.p10934e.p10935a.C146830d;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147111h;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10947c.C147204f;
import com.google.android.libraries.p10923ac.p10947c.C147205g;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10959c.p10960a.C147240a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10959c.p10961b.C147242b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C64010bt;
import com.google.protos.p4895aw.p4902b.C64094l;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.WeakHashMap;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.g */
/* compiled from: PG */
public final class C147281g implements C147205g {

    /* renamed from: a */
    public final C62917ay f397526a;

    /* renamed from: b */
    private final C146771a f397527b;

    /* renamed from: c */
    private final C147111h f397528c;

    /* renamed from: d */
    private final C146830d f397529d;

    /* renamed from: e */
    private final String f397530e;

    /* renamed from: f */
    private final Account f397531f;

    /* renamed from: g */
    private final int f397532g;

    /* renamed from: h */
    private final int f397533h;

    /* renamed from: i */
    private final C64098p f397534i;

    public C147281g(C146771a aVar, C147111h hVar, C146830d dVar, String str, Account account, int i, int i2, C62917ay ayVar) {
        this.f397527b = aVar;
        this.f397528c = hVar;
        this.f397529d = dVar;
        this.f397530e = str;
        this.f397531f = account;
        this.f397532g = i;
        this.f397533h = i2;
        this.f397526a = ayVar;
        this.f397534i = C146854ax.m239334d(i, i2, C63978ao.SYNC_LATEST_PER_SECONDARY_ID);
        new WeakHashMap();
    }

    /* renamed from: a */
    public final C60870cx mo124031a(C147204f fVar) {
        C146830d dVar = this.f397529d;
        String str = this.f397530e;
        Account account = this.f397531f;
        int i = this.f397532g;
        int i2 = this.f397533h;
        C146815l a = C147242b.m240098a(fVar);
        C68214a a2 = C68219e.m98518a(((C68226l) dVar.f396396a).f184585a);
        a2.getClass();
        C146855ay ayVar = (C146855ay) dVar.f396397b.mo17428b();
        ayVar.getClass();
        C147116m mVar = (C147116m) dVar.f396398c.mo17428b();
        mVar.getClass();
        account.getClass();
        a.getClass();
        return C60922j.m93044g(this.f397527b.mo123625a(new C146829c(a2, ayVar, mVar, str, account, i, i2, a)), new C147280f(this), this.f397527b);
    }

    /* renamed from: b */
    public final void mo124032b(C146765h hVar, C147204f fVar) {
        C147111h hVar2 = this.f397528c;
        C146800g b = C147240a.m240096b(hVar);
        String str = this.f397530e;
        Account account = this.f397531f;
        C64098p pVar = this.f397534i;
        C146815l a = C147242b.m240098a(fVar);
        C64094l lVar = (C64094l) C64095m.f173283c.createBuilder();
        C64010bt e = C146854ax.m239335e(a);
        lVar.copyOnWrite();
        C64095m mVar = (C64095m) lVar.instance;
        e.getClass();
        mVar.f173286b = e;
        mVar.f173285a = 1;
        this.f397527b.mo123625a(hVar2.mo123942a(b, str, account, pVar, (C64095m) lVar.build()));
    }
}
