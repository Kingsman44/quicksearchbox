package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89641l;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94933a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95297c;
import com.google.android.libraries.assistant.accessory.gmutls.C11018a;
import com.google.android.libraries.assistant.accessory.gmutls.C11021d;
import com.google.android.libraries.assistant.accessory.gmutls.C11022e;
import com.google.assistant.p3739a.p3740a.C48062aw;
import com.google.assistant.p3739a.p3740a.C48063ax;
import com.google.assistant.p3739a.p3740a.C48074bh;
import com.google.assistant.p3739a.p3740a.C48075bi;
import com.google.assistant.p3739a.p3740a.C48076bj;
import com.google.assistant.p3739a.p3740a.C48077bk;
import com.google.assistant.p3739a.p3740a.C48091by;
import com.google.assistant.p3739a.p3740a.C48092bz;
import com.google.assistant.p3739a.p3740a.C48120q;
import com.google.assistant.p3739a.p3740a.C48123t;
import com.google.assistant.p3739a.p3740a.C48124u;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60066jo;
import com.google.common.p4552o.C60069jr;
import com.google.protobuf.C63088z;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLEngineResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.c.c */
/* compiled from: PG */
public final class C94931c implements C11021d {

    /* renamed from: a */
    public static final C59071e f265548a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.c.c");

    /* renamed from: b */
    public final C11022e f265549b;

    /* renamed from: c */
    public final C94929a f265550c;

    /* renamed from: d */
    public final C94933a f265551d;

    /* renamed from: e */
    public final String f265552e;

    /* renamed from: f */
    public final C95297c f265553f;

    /* renamed from: g */
    public final AtomicInteger f265554g = new AtomicInteger(0);

    /* renamed from: h */
    public int f265555h = 30;

    /* renamed from: i */
    public Handler f265556i;

    /* renamed from: j */
    public final AtomicInteger f265557j = new AtomicInteger(0);

    /* renamed from: k */
    public final byte[] f265558k;

    /* renamed from: l */
    public int f265559l;

    /* renamed from: m */
    public final int f265560m;

    /* renamed from: n */
    public final String f265561n;

    public C94931c(C11022e eVar, C94929a aVar, byte[] bArr, C95297c cVar, C94933a aVar2, String str, Context context) {
        int i = 0;
        this.f265549b = eVar;
        this.f265550c = aVar;
        this.f265558k = bArr;
        this.f265553f = cVar;
        this.f265551d = aVar2;
        this.f265552e = str;
        Integer a = C89641l.m145912a(context, context.getPackageName());
        this.f265560m = a != null ? a.intValue() : i;
        this.f265561n = C89641l.m145914c(context, context.getPackageName());
    }

    /* renamed from: g */
    public static byte[] m156727g(C48074bh bhVar, int i, int i2, int i3, String str) {
        C48062aw awVar = (C48062aw) C48063ax.f124391e.createBuilder();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        awVar.copyOnWrite();
        valueOf.getClass();
        ((C48063ax) awVar.instance).f124394b = valueOf;
        String valueOf2 = String.valueOf(i3);
        awVar.copyOnWrite();
        valueOf2.getClass();
        ((C48063ax) awVar.instance).f124395c = valueOf2;
        awVar.copyOnWrite();
        ((C48063ax) awVar.instance).f124393a = 1;
        if (str != null) {
            awVar.copyOnWrite();
            ((C48063ax) awVar.instance).f124396d = str;
        }
        C48123t tVar = (C48123t) C48124u.f124543f.createBuilder();
        C48075bi biVar = (C48075bi) C48076bj.f124425g.createBuilder();
        int i4 = bhVar.f124419a;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124427a = i4;
        int i5 = bhVar.f124420b;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124428b = i5;
        int i6 = bhVar.f124421c;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124429c = i6;
        int i7 = bhVar.f124422d;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124430d = i7;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124432f = i2;
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124431e = C48077bk.m85178a(3);
        tVar.copyOnWrite();
        C48124u uVar = (C48124u) tVar.instance;
        C48076bj bjVar = (C48076bj) biVar.build();
        bjVar.getClass();
        uVar.f124547c = bjVar;
        uVar.f124546b = 2;
        tVar.copyOnWrite();
        ((C48124u) tVar.instance).f124548d = i;
        tVar.copyOnWrite();
        C48124u uVar2 = (C48124u) tVar.instance;
        C48063ax axVar = (C48063ax) awVar.build();
        axVar.getClass();
        uVar2.f124549e = axVar;
        uVar2.f124545a |= 1;
        return ((C48124u) tVar.build()).toByteArray();
    }

    /* renamed from: h */
    public static byte[] m156728h() {
        C48123t tVar = (C48123t) C48124u.f124543f.createBuilder();
        C48091by byVar = (C48091by) C48092bz.f124458d.createBuilder();
        byVar.copyOnWrite();
        ((C48092bz) byVar.instance).f124461b = 2;
        byVar.copyOnWrite();
        ((C48092bz) byVar.instance).f124460a = C48120q.m85186a(4);
        tVar.copyOnWrite();
        C48124u uVar = (C48124u) tVar.instance;
        C48092bz bzVar = (C48092bz) byVar.build();
        bzVar.getClass();
        uVar.f124547c = bzVar;
        uVar.f124546b = 3;
        return ((C48124u) tVar.build()).toByteArray();
    }

    /* renamed from: i */
    public static byte[] m156729i(byte[] bArr) {
        C48123t tVar = (C48123t) C48124u.f124543f.createBuilder();
        C48091by byVar = (C48091by) C48092bz.f124458d.createBuilder();
        byVar.copyOnWrite();
        ((C48092bz) byVar.instance).f124461b = 2;
        C63088z A = C63088z.m96139A(bArr);
        byVar.copyOnWrite();
        ((C48092bz) byVar.instance).f124462c = A;
        tVar.copyOnWrite();
        C48124u uVar = (C48124u) tVar.instance;
        C48092bz bzVar = (C48092bz) byVar.build();
        bzVar.getClass();
        uVar.f124547c = bzVar;
        uVar.f124546b = 3;
        return ((C48124u) tVar.build()).toByteArray();
    }

    /* renamed from: a */
    public final void mo88840a() {
        this.f265554g.set(0);
        this.f265557j.getAndSet(0);
        C58976aa aaVar = C58975e.f156826a;
        mo88841b();
        mo88842e();
    }

    /* renamed from: b */
    public final void mo88841b() {
        C94929a aVar = this.f265550c;
        C48123t tVar = (C48123t) C48124u.f124543f.createBuilder();
        C48075bi biVar = (C48075bi) C48076bj.f124425g.createBuilder();
        biVar.copyOnWrite();
        ((C48076bj) biVar.instance).f124431e = C48077bk.m85178a(4);
        tVar.copyOnWrite();
        C48124u uVar = (C48124u) tVar.instance;
        C48076bj bjVar = (C48076bj) biVar.build();
        bjVar.getClass();
        uVar.f124547c = bjVar;
        uVar.f124546b = 2;
        aVar.mo88735a(((C48124u) tVar.build()).toByteArray());
        C95297c cVar = this.f265553f;
        C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
        joVar.copyOnWrite();
        C60069jr jrVar = (C60069jr) joVar.instance;
        jrVar.f162383c = 1;
        jrVar.f162381a = 2 | jrVar.f162381a;
        cVar.mo89225a(joVar);
        this.f265557j.getAndSet(1);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: c */
    public final void mo19472c(int i) {
        if (this.f265557j.get() == 3) {
            C59104x b = f265548a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoCryptoDataHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17643)).mo56389s("[%s] Extra handshake payload, ignoring ...", this.f265552e);
        } else if (i == 11) {
            C95297c cVar = this.f265553f;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 6;
            jrVar.f162381a |= 2;
            int i2 = this.f265554g.get();
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 32;
            jrVar2.f162386f = i2;
            cVar.mo89225a(joVar);
            this.f265557j.getAndSet(3);
            C58976aa aaVar = C58975e.f156826a;
            this.f265550c.mo88736b();
            C95297c cVar2 = this.f265553f;
            C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar2.copyOnWrite();
            C60069jr jrVar3 = (C60069jr) joVar2.instance;
            jrVar3.f162383c = 9;
            jrVar3.f162381a |= 2;
            cVar2.mo89225a(joVar2);
        } else {
            C59071e eVar = f265548a;
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoCryptoDataHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17641)).mo56352E("[%s] Handshake ended due to error, with code: %d", this.f265552e, i);
            C95297c cVar3 = this.f265553f;
            C60066jo joVar3 = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar3.copyOnWrite();
            C60069jr jrVar4 = (C60069jr) joVar3.instance;
            jrVar4.f162383c = 7;
            jrVar4.f162381a |= 2;
            joVar3.copyOnWrite();
            C60069jr jrVar5 = (C60069jr) joVar3.instance;
            jrVar5.f162381a |= 256;
            jrVar5.f162389i = i;
            int i3 = this.f265554g.get();
            joVar3.copyOnWrite();
            C60069jr jrVar6 = (C60069jr) joVar3.instance;
            jrVar6.f162381a |= 32;
            jrVar6.f162386f = i3;
            cVar3.mo89225a(joVar3);
            if (i == 7) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BistoCryptoDataHandler");
                ((C59052c) ((C59052c) b2).mo56372aa(17642)).mo56389s("[%s] Handshake timeout, client user should re-OOBE", this.f265552e);
                this.f265550c.mo88738d();
                return;
            }
            this.f265550c.mo88737c();
        }
    }

    /* renamed from: d */
    public final void mo19473d(SSLEngineResult sSLEngineResult, C11018a aVar) {
        if (!SSLEngineResult.Status.CLOSED.equals(sSLEngineResult.getStatus())) {
            C59104x b = f265548a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoCryptoDataHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17644)).mo56389s("[%s] Handshake step timeout, retransmitting.", this.f265552e);
            this.f265554g.addAndGet(aVar.size());
            this.f265550c.mo88735a(m156729i(aVar.mo19468d()));
        }
    }

    /* renamed from: e */
    public final void mo88842e() {
        if (this.f265556i != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f265556i.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: f */
    public final void mo19474f() {
        C58976aa aaVar = C58975e.f156826a;
    }
}
