package com.google.android.libraries.lens.view.p2161r;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.r.e */
/* compiled from: PG */
public final class C27658e {

    /* renamed from: a */
    public static final C58974d f75513a = C58974d.m91135i("StateDumper");

    /* renamed from: c */
    private static final String[] f75514c = {BuildConfig.FLAVOR, C58880cq.m90966b("  ", 1), C58880cq.m90966b("  ", 2), C58880cq.m90966b("  ", 3), C58880cq.m90966b("  ", 4), C58880cq.m90966b("  ", 5), C58880cq.m90966b("  ", 6), C58880cq.m90966b("  ", 7), C58880cq.m90966b("  ", 8), C58880cq.m90966b("  ", 9)};

    /* renamed from: b */
    public final Map f75515b;

    /* renamed from: d */
    private final int f75516d;

    /* renamed from: e */
    private final List f75517e;

    /* renamed from: f */
    private final C27658e f75518f;

    /* renamed from: g */
    private final WeakReference f75519g;

    /* renamed from: h */
    private final boolean f75520h;

    /* renamed from: a */
    public static C27658e m51456a(C25799b bVar, boolean z) {
        return new C27658e(0, new LinkedList(), new LinkedHashMap(), (C27658e) null, new WeakReference((Object) null), z || (!bVar.mo30940a() && !bVar.mo30941b()));
    }

    /* renamed from: h */
    private final boolean m51457h(C27654a aVar) {
        if (this.f75519g.get() == aVar) {
            return true;
        }
        C27658e eVar = this.f75518f;
        return eVar != null && eVar.m51457h(aVar);
    }

    /* renamed from: b */
    public final void mo33145b(Appendable appendable, String str) {
        String str2;
        for (C27657d dVar : this.f75517e) {
            StringBuilder sb = new StringBuilder();
            int i = dVar.f75510a;
            if (i < 0) {
                str2 = f75514c[0];
            } else {
                String[] strArr = f75514c;
                int length = strArr.length;
                if (i < 10) {
                    str2 = strArr[i];
                } else {
                    str2 = strArr[9];
                }
            }
            String dVar2 = dVar.toString();
            sb.append(str2);
            sb.append(dVar2);
            appendable.append(str).append(sb).append("\n");
        }
    }

    /* renamed from: c */
    public final void mo33146c(C27654a aVar) {
        if (!m51457h(aVar)) {
            C27658e eVar = new C27658e(this.f75516d + 1, this.f75517e, this.f75515b, this, new WeakReference(aVar), this.f75520h);
            try {
                aVar.mo30427c(eVar);
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f75513a.mo56226d()).mo56382g(e)).mo56372aa(49335)).mo56386p("Exception during dump()");
                eVar.mo33148e("DumpException", String.format(Locale.US, "[%s]", new Object[]{e.getClass().getSimpleName()}));
            }
        } else {
            mo33148e(BuildConfig.FLAVOR, "Cycle Detected");
            ((C58970a) ((C58970a) f75513a.mo56226d()).mo56372aa(49336)).mo56386p("dump(): cycle detected");
        }
    }

    /* renamed from: d */
    public final void mo33147d(String str, C63088z zVar, boolean z) {
        Map map = this.f75515b;
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.mo50685c(zVar);
        aVar.mo50684b(z);
        map.put(str, aVar.mo50683a());
    }

    /* renamed from: e */
    public final void mo33148e(String str, String str2) {
        this.f75517e.add(new C27657d(this.f75516d, str, str2));
    }

    /* renamed from: f */
    public final void mo33149f(String str, String str2) {
        List list = this.f75517e;
        int i = this.f75516d;
        if (this.f75520h) {
            str2 = String.format(Locale.US, "[REDACTED-%d]", new Object[]{Integer.valueOf(str2.length())});
        }
        list.add(new C27657d(i, str, str2));
    }

    /* renamed from: g */
    public final void mo33150g(String str) {
        this.f75517e.add(new C27657d(this.f75516d - 1, str, BuildConfig.FLAVOR));
    }

    private C27658e(int i, List list, Map map, C27658e eVar, WeakReference weakReference, boolean z) {
        this.f75516d = i;
        list.getClass();
        this.f75517e = Collections.synchronizedList(list);
        this.f75515b = map;
        this.f75519g = weakReference;
        this.f75518f = eVar;
        this.f75520h = z;
    }
}
