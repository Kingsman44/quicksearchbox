package com.google.android.apps.gsa.nga.shared.p6331aq.p6333b;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82458fy;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82464gd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82465ge;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82466gf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82467gg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82469gi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82470gj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82471gk;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82688ol;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82689om;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.nga.shared.aq.b.e */
/* compiled from: PG */
public final class C81014e implements C81013d {

    /* renamed from: a */
    public final C83305i f222055a;

    public C81014e(C83305i iVar) {
        this.f222055a = iVar;
    }

    /* renamed from: a */
    public final void mo74785a(String str, boolean z) {
        C83305i iVar = this.f222055a;
        if (str != null) {
            iVar.mo75579d(new C82466gf("NGA_WARM_ACTIONS_RESOURCE_FILE_STATUS", str, z));
            return;
        }
        throw new NullPointerException("Null fileId");
    }

    /* renamed from: b */
    public final void mo74786b(String str, boolean z) {
        C83305i iVar = this.f222055a;
        if (str != null) {
            iVar.mo75579d(new C82467gg("NGA_WARM_ACTIONS_RESOURCE_URI_STATUS", str, z));
            return;
        }
        throw new NullPointerException("Null fileId");
    }

    /* renamed from: c */
    public final void mo74787c(C79570b bVar, int i) {
        C83305i iVar = this.f222055a;
        C82688ol f = C82689om.m132105f();
        f.mo76312b(bVar.f218339o);
        ((C82458fy) f).f225306b = C81010a.m128931a(i);
        iVar.mo75579d(f.mo76311a());
    }

    /* renamed from: d */
    public final void mo74788d(C79570b bVar, int i) {
        String str;
        C83305i iVar = this.f222055a;
        int i2 = bVar.f218339o;
        switch (i) {
            case 1:
                str = "MISSING_HOTQUERY_TRIGGER_TYPE";
                break;
            case 2:
                str = "MISSING_MATCHED_HOTQUERY";
                break;
            case 3:
                str = "MISSING_TRIGGERING_CONTEXT";
                break;
            case 4:
                str = "NON_HOTQUERY_EVENT";
                break;
            case 5:
                str = "OK";
                break;
            case 6:
                str = "UNSUPPORTED_CONTEXT_TYPE";
                break;
            case 7:
                str = "WRONG_CONTEXT_EVENT_ID";
                break;
            default:
                str = "WRONG_HOTQUERY_CATEGORY";
                break;
        }
        iVar.mo75579d(new C82464gd("NGA_WARM_ACTIONS_RECOGNITION_RESULT_STATUS", i2, str));
    }

    /* renamed from: e */
    public final void mo74789e(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f222055a.mo75579d(new C82465ge("NGA_WARM_ACTIONS_RECOGNITION_START_STATUS", ((C79570b) it.next()).f218339o, i != 1 ? i != 2 ? "SUCCESS" : "FAILURE" : "CANCELLATION"));
        }
    }

    /* renamed from: f */
    public final void mo74790f(C79570b bVar, int i) {
        this.f222055a.mo75579d(new C82469gi("NGA_WARM_ACTIONS_SODA_CONFIG_ERROR", bVar.f218339o, i != 1 ? i != 2 ? "NO_TRIGGER_PHRASES" : "NO_ERROR" : "NO_BIASING_FEATURES"));
    }

    /* renamed from: g */
    public final void mo74791g(int i) {
        this.f222055a.mo75579d(new C82470gj("NGA_WARM_ACTIONS_SODA_INITIALIZATION_RESULT_COUNT", i != 1 ? "OK" : "INIT_EXCEPTION"));
    }

    /* renamed from: h */
    public final void mo74792h(C79570b bVar, boolean z) {
        this.f222055a.mo75579d(new C82471gk("NGA_WARM_ACTIONS_SODA_SESSION_COUNT", bVar.f218339o, z));
    }
}
