package com.google.android.gms.learning.p10821b;

import android.content.Context;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143665r;
import com.google.android.gms.clearcut.C143667t;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.p10822c.C144580a;
import com.google.android.libraries.micore.learning.base.C29716h;
import com.google.android.libraries.micore.learning.p2258a.C29698h;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.p4552o.p4554b.p4555a.C59620ap;
import com.google.common.p4552o.p4554b.p4555a.C59621aq;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59629i;
import com.google.common.p4552o.p4554b.p4555a.C59630j;
import com.google.common.p4552o.p4554b.p4555a.C59633m;
import com.google.common.p4552o.p4554b.p4555a.C59634n;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.learning.b.c */
/* compiled from: PG */
public final class C144576c implements Closeable, C144827n {

    /* renamed from: c */
    private static final C59621aq f391220c;

    /* renamed from: a */
    final C143658k f391221a;

    /* renamed from: b */
    public final C29716h f391222b;

    /* renamed from: d */
    private final C143623ad f391223d;

    /* renamed from: e */
    private final C144573b f391224e;

    /* renamed from: f */
    private final C143673z f391225f;

    /* renamed from: g */
    private final String f391226g;

    /* renamed from: h */
    private final C59628h f391227h;

    /* renamed from: i */
    private final byte[] f391228i;

    /* renamed from: j */
    private final C143665r f391229j;

    /* renamed from: k */
    private final Set f391230k;

    /* renamed from: l */
    private final C144575b f391231l;

    static {
        C59620ap apVar = (C59620ap) C59621aq.f159860c.createBuilder();
        apVar.copyOnWrite();
        C59621aq aqVar = (C59621aq) apVar.instance;
        aqVar.f159862a |= 1;
        aqVar.f159863b = 69000;
        f391220c = (C59621aq) apVar.build();
    }

    private C144576c(Context context, C144573b bVar, C29716h hVar, C144575b bVar2) {
        HashSet hashSet;
        this.f391224e = bVar;
        this.f391222b = hVar;
        this.f391231l = bVar2;
        String packageName = context.getPackageName();
        this.f391226g = packageName;
        if (bVar.mo119992aZ()) {
            this.f391221a = C143658k.m233375f(context, "BRELLA");
        } else if (bVar.mo119988aV()) {
            this.f391221a = C143658k.m233374c(context, "BRELLA").mo118952a();
        } else {
            this.f391221a = C143658k.m233373b(context, "BRELLA").mo118952a();
        }
        this.f391223d = C24006d.m44596b(context, new C144580a());
        if (bVar.mo119993aa()) {
            C143673z zVar = new C143673z(this.f391221a, "BRELLA_COUNTERS", bVar.mo120026f(), C144006f.f390244a);
            this.f391225f = zVar;
            zVar.mo119025i();
            C59629i iVar = (C59629i) C59630j.f159882d.createBuilder();
            iVar.copyOnWrite();
            C59630j jVar = (C59630j) iVar.instance;
            jVar.f159884a |= 2;
            jVar.f159886c = true;
            if (packageName != null) {
                iVar.copyOnWrite();
                C59630j jVar2 = (C59630j) iVar.instance;
                jVar2.f159884a |= 1;
                jVar2.f159885b = packageName;
            }
            C59627g gVar = (C59627g) C59628h.f159873h.createBuilder();
            C59621aq aqVar = f391220c;
            gVar.copyOnWrite();
            C59628h hVar2 = (C59628h) gVar.instance;
            aqVar.getClass();
            hVar2.f159879e = aqVar;
            hVar2.f159875a |= 1024;
            gVar.copyOnWrite();
            C59628h hVar3 = (C59628h) gVar.instance;
            C59630j jVar3 = (C59630j) iVar.build();
            jVar3.getClass();
            hVar3.f159876b = jVar3;
            hVar3.f159875a |= 1;
            C59628h hVar4 = (C59628h) gVar.build();
            this.f391227h = hVar4;
            this.f391228i = hVar4.toByteArray();
            this.f391229j = new C143665r(bVar.mo120025e());
            hashSet = new HashSet(bVar.mo119963X());
        } else {
            hashSet = null;
            this.f391225f = null;
            this.f391227h = null;
            this.f391228i = null;
            this.f391229j = null;
        }
        this.f391230k = hashSet;
    }

    /* renamed from: k */
    public static C144576c m235055k(Context context, C144573b bVar, C29716h hVar) {
        return new C144576c(context, bVar, hVar, bVar.mo119970aD() ? new C144575b(context) : null);
    }

    /* renamed from: m */
    private final void m235056m(String str, C59628h hVar, long j) {
        mo120059l(str, hVar == null ? null : hVar.toByteArray(), j);
    }

    /* renamed from: n */
    private final void m235057n(int i, String str) {
        C59633m mVar = (C59633m) C59634n.f159891c.createBuilder();
        mVar.copyOnWrite();
        C59634n nVar = (C59634n) mVar.instance;
        nVar.f159893a |= 1;
        nVar.f159894b = (long) i;
        C59627g gVar = (C59627g) C59628h.f159873h.createBuilder();
        gVar.copyOnWrite();
        C59628h hVar = (C59628h) gVar.instance;
        C59634n nVar2 = (C59634n) mVar.build();
        nVar2.getClass();
        hVar.f159878d = nVar2;
        hVar.f159875a |= 64;
        if (str == null) {
            str = this.f391226g;
        }
        m235058o(gVar, str);
    }

    /* renamed from: o */
    private final void m235058o(C59627g gVar, String str) {
        C59621aq aqVar = f391220c;
        gVar.copyOnWrite();
        C59628h hVar = (C59628h) gVar.instance;
        C59628h hVar2 = C59628h.f159873h;
        aqVar.getClass();
        hVar.f159879e = aqVar;
        hVar.f159875a |= 1024;
        C59630j jVar = ((C59628h) gVar.instance).f159876b;
        if (jVar == null) {
            jVar = C59630j.f159882d;
        }
        C59629i iVar = (C59629i) jVar.toBuilder();
        iVar.copyOnWrite();
        C59630j jVar2 = (C59630j) iVar.instance;
        jVar2.f159884a |= 2;
        jVar2.f159886c = true;
        if (str != null) {
            C59630j jVar3 = ((C59628h) gVar.instance).f159876b;
            if (jVar3 == null) {
                jVar3 = C59630j.f159882d;
            }
            if (jVar3.f159885b.isEmpty()) {
                iVar.copyOnWrite();
                C59630j jVar4 = (C59630j) iVar.instance;
                jVar4.f159884a |= 1;
                jVar4.f159885b = str;
            }
        }
        gVar.copyOnWrite();
        C59628h hVar3 = (C59628h) gVar.instance;
        C59630j jVar5 = (C59630j) iVar.build();
        jVar5.getClass();
        hVar3.f159876b = jVar5;
        hVar3.f159875a |= 1;
        C59628h hVar4 = (C59628h) gVar.build();
        C143657j d = this.f391221a.mo118999d(hVar4);
        d.f389472n = this.f391223d;
        d.mo118992a();
        C144575b bVar = this.f391231l;
        if (bVar != null) {
            C144578e.m235071a(bVar.f391219a, hVar4);
        }
    }

    /* renamed from: a */
    public final C59628h mo120048a(C59628h hVar) {
        C59628h hVar2 = this.f391227h;
        if (hVar2 == null) {
            return hVar;
        }
        C59627g gVar = (C59627g) hVar2.toBuilder();
        gVar.mergeFrom(hVar);
        return (C59628h) gVar.build();
    }

    /* renamed from: b */
    public final void mo120049b() {
        C143673z zVar = this.f391225f;
        if (zVar != null) {
            zVar.mo119021e().mo119022f();
        }
    }

    /* renamed from: c */
    public final void mo120050c(C59628h hVar) {
        if (hVar != null) {
            m235058o((C59627g) hVar.toBuilder(), this.f391226g);
        }
    }

    public final void close() {
        mo120049b();
    }

    /* renamed from: d */
    public final void mo120052d(int i, C59628h hVar, long j) {
        String str;
        switch (i) {
            case 1:
                str = "EXAMPLE_STORE_ITERATOR_NEXT_LATENCY";
                break;
            case 2:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT";
                break;
            case 3:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE";
                break;
            case 4:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY";
                break;
            case 5:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY";
                break;
            case 6:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY";
                break;
            case 7:
                str = "EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY";
                break;
            case 8:
                str = "EXAMPLE_STORE_ERROR_COUNT";
                break;
            case 9:
                str = "TRAINING_SYSTEM_TOTAL_MEM";
                break;
            case 10:
                str = "TRAINING_SYSTEM_AVAILABLE_MEM";
                break;
            case 11:
                str = "TRAINING_SYSTEM_LOW_MEM_THRESHOLD";
                break;
            case 12:
                str = "TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD";
                break;
            case 13:
                str = "TRAINING_SYSTEM_LOW_MEM_STATE";
                break;
            case 14:
                str = "TRAINING_PROCESS_MEM_IMPORTANCE_STATE";
                break;
            case 15:
                str = "TRAINING_PROCESS_MEM_LRU_STATE";
                break;
            case 16:
                str = "TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP";
                break;
            default:
                str = "TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS";
                break;
        }
        m235056m(str, hVar, j);
    }

    /* renamed from: e */
    public final C144574a mo120053e(int i, C59628h hVar) {
        return new C144574a(this, i != 1 ? i != 2 ? i != 3 ? "EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY" : "EXAMPLE_STORE_START_QUERY_LATENCY" : "TRAINING_SAVE_CHECKPOINT_LATENCY" : "TRAINING_OVERALL_LATENCY", hVar, this.f391222b.mo34860b());
    }

    /* renamed from: f */
    public final void mo120054f(int i, C59628h hVar, long j) {
        String str;
        switch (i) {
            case 2:
                str = "HISTOGRAM_COUNTER_UNDEFINED";
                break;
            case 3:
                str = "TRAINING_RUN_PHASE_LATENCY";
                break;
            case 4:
                str = "TRAINING_RUN_PHASE_END_TIME";
                break;
            case 5:
                str = "TRAINING_RESTORE_STATE_LATENCY";
                break;
            case 6:
                str = "TRAINING_RUN_CLIENT_EXECUTION_LATENCY";
                break;
            case 7:
                str = "TRAINING_INIT_OP_LATENCY";
                break;
            case 8:
                str = "TRAINING_BEFORE_OP_LATENCY";
                break;
            case 9:
                str = "TRAINING_AFTER_OP_LATENCY";
                break;
            case 10:
                str = "TRAINING_RUN_EPOCH_LATENCY";
                break;
            case 11:
                str = "TRAINING_GATHER_MINI_BATCH_LATENCY";
                break;
            case 12:
                str = "TRAINING_RUN_MINI_BATCH_LATENCY";
                break;
            case 13:
                str = "TRAINING_INTERRUPT_TERMINATION_LATENCY";
                break;
            case 14:
                str = "TRAINING_OPSTATS_COMMIT_LATENCY";
                break;
            default:
                switch (i) {
                    case 100003:
                        str = "TRAINING_OVERALL_EXAMPLE_COUNT";
                        break;
                    case 100004:
                        str = "TRAINING_OVERALL_EXAMPLE_SIZE";
                        break;
                    case 100005:
                        str = "TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT";
                        break;
                    case 100006:
                        str = "TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE";
                        break;
                    case 100007:
                        str = "TRAINING_EPOCH_EXAMPLE_COUNT";
                        break;
                    case 100008:
                        str = "TRAINING_EPOCH_EXAMPLE_SIZE";
                        break;
                    case 100009:
                        str = "TRAINING_MINI_BATCH_EXAMPLE_COUNT";
                        break;
                    case 100010:
                        str = "TRAINING_MINI_BATCH_EXAMPLE_SIZE";
                        break;
                    case 100011:
                        str = "OPSTATS_DB_SIZE_BYTES";
                        break;
                    case 100012:
                        str = "OPSTATS_DB_NUM_ENTRIES";
                        break;
                    case 100013:
                        str = "OPSTATS_NUM_PRUNED_ENTRIES";
                        break;
                    case 100014:
                        str = "OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS";
                        break;
                    default:
                        switch (i) {
                            case 200003:
                                str = "TRAINING_FL_CHECKIN_LATENCY";
                                break;
                            case 200004:
                                str = "TRAINING_FL_REPORT_RESULTS_END_TIME";
                                break;
                            case 200005:
                                str = "TRAINING_FL_REPORT_RESULTS_LATENCY";
                                break;
                            case 200006:
                                str = "TRAINING_FL_CHECKIN_END_TIME";
                                break;
                            case 200007:
                                str = "TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                }
        }
        m235056m(str, hVar, j);
    }

    /* renamed from: g */
    public final void mo120055g(int i) {
        mo120057i(i, (String) null);
    }

    /* renamed from: h */
    public final void mo120056h(int i) {
        mo120058j(i, (String) null);
    }

    /* renamed from: i */
    public final void mo120057i(int i, String str) {
        if (this.f391224e.mo119973aG() && this.f391224e.mo119971aE()) {
            if (i != 1) {
                m235057n(i - 2, str);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: j */
    public final void mo120058j(int i, String str) {
        if (this.f391224e.mo119973aG()) {
            m235057n(C29698h.m54786a(i), str);
        }
    }

    /* renamed from: l */
    public final void mo120059l(String str, byte[] bArr, long j) {
        C143665r rVar;
        C143673z zVar = this.f391225f;
        if (zVar != null) {
            if (bArr == null) {
                bArr = this.f391228i;
            }
            if (this.f391230k.contains(str)) {
                rVar = C143673z.f389507p;
            } else {
                rVar = this.f391229j;
            }
            zVar.mo119028l(str, rVar).mo119007b(j, new C143667t(bArr));
        }
    }
}
