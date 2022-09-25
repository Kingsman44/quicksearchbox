package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.platform.appintegration.p8991c.C119521a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17867g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17868h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17869i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.am */
/* compiled from: PG */
public final class C119593am implements C119617bc {

    /* renamed from: a */
    private static final C59071e f333313a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.am");

    /* renamed from: b */
    private Optional f333314b = Optional.empty();

    /* renamed from: c */
    private Optional f333315c = Optional.empty();

    /* renamed from: d */
    private final List f333316d = new ArrayList();

    /* renamed from: e */
    private final Context f333317e;

    /* renamed from: f */
    private final C119618bd f333318f;

    /* renamed from: g */
    private final C119618bd f333319g;

    /* renamed from: h */
    private final C119618bd f333320h;

    /* renamed from: i */
    private final String f333321i;

    public C119593am(Context context, C119618bd bdVar, C119618bd bdVar2, String str, C119618bd bdVar3) {
        this.f333317e = context;
        this.f333318f = bdVar;
        this.f333319g = bdVar2;
        this.f333320h = bdVar3;
        this.f333321i = str;
    }

    /* renamed from: h */
    private final void m198489h(Optional optional) {
        Optional optional2 = this.f333314b;
        if (!optional2.equals(optional)) {
            this.f333314b = optional;
            if (optional.isPresent()) {
                ((C119616bb) this.f333314b.get()).mo104441d(optional2);
            } else {
                optional2.ifPresent(C119592al.f333312a);
            }
        }
    }

    /* renamed from: a */
    public final C119616bb mo104458a(C17867g gVar, C70862aj ajVar) {
        C119616bb bbVar;
        String str = gVar.f51199b;
        int i = 0;
        try {
            i = this.f333317e.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (gVar.f51202e) {
            ((C59052c) ((C59052c) f333313a.mo56224b()).mo56372aa(34481)).mo56389s("TngMorrisKarajan is enabled for package: %s", str);
            bbVar = this.f333320h.mo104448a(str, ajVar);
        } else if (C119521a.m198385a(this.f333321i, gVar.f51199b, i)) {
            ((C59052c) ((C59052c) f333313a.mo56224b()).mo56372aa(34480)).mo56389s("UseMosaic is enabled for package: %s", str);
            bbVar = this.f333319g.mo104448a(str, ajVar);
        } else {
            bbVar = this.f333318f.mo104448a(str, ajVar);
        }
        synchronized (this.f333316d) {
            this.f333316d.add(bbVar);
            mo104464g();
        }
        if (this.f333315c.isPresent()) {
            C17868h hVar = (C17868h) C17869i.f51204c.createBuilder();
            C17909k kVar = (C17909k) this.f333315c.get();
            hVar.copyOnWrite();
            C17869i iVar = (C17869i) hVar.instance;
            kVar.getClass();
            iVar.f51207b = kVar;
            iVar.f51206a |= 1;
            ajVar.mo20123c((C17869i) hVar.build());
        }
        return bbVar;
    }

    /* renamed from: b */
    public final void mo104459b(C17909k kVar) {
        if (this.f333314b.isPresent()) {
            ((C119616bb) this.f333314b.get()).mo104440c(kVar);
        }
    }

    /* renamed from: c */
    public final void mo104460c() {
        if (this.f333314b.isPresent()) {
            ((C119616bb) this.f333314b.get()).mo104442e();
        }
    }

    /* renamed from: d */
    public final void mo104461d(C17909k kVar) {
        if (this.f333314b.isPresent()) {
            ((C119616bb) this.f333314b.get()).mo104444g(kVar);
        }
    }

    /* renamed from: e */
    public final void mo104462e(C119616bb bbVar) {
        if (bbVar != null) {
            synchronized (this.f333316d) {
                if (this.f333316d.remove(bbVar)) {
                    mo104464g();
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo104463f(Optional optional) {
        this.f333315c = optional;
    }

    /* renamed from: g */
    public final void mo104464g() {
        if (this.f333316d.isEmpty()) {
            m198489h(Optional.empty());
            return;
        }
        r1 = null;
        for (C119616bb bbVar : this.f333316d) {
            String a = bbVar.mo104438a();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f333317e.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                ((C59052c) ((C59052c) f333313a.mo56226d()).mo56372aa(34491)).mo56386p("No running process");
            } else {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.importance == 100 && next.pkgList != null && Arrays.asList(next.pkgList).contains(a)) {
                        m198489h(Optional.m71637of(bbVar));
                        return;
                    }
                }
                continue;
            }
        }
        m198489h(Optional.ofNullable(bbVar));
    }
}
