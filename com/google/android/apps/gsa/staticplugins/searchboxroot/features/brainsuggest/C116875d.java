package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88568b;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.d */
/* compiled from: PG */
public final class C116875d extends C88582c implements C89204i, C89196a {

    /* renamed from: a */
    public static final C59071e f324363a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.d");

    /* renamed from: b */
    public final Context f324364b;

    /* renamed from: c */
    public final C86124t f324365c;

    /* renamed from: d */
    public C90931ca f324366d;

    /* renamed from: e */
    BrainSuggestDecoder f324367e = null;

    /* renamed from: f */
    boolean f324368f = false;

    /* renamed from: g */
    private final C116877f f324369g;

    /* renamed from: h */
    private final Object f324370h = new Object();

    /* renamed from: i */
    private final LinkedList f324371i = new LinkedList();

    public C116875d(Context context, C86124t tVar, C116877f fVar) {
        this.f324364b = context;
        this.f324365c = tVar;
        this.f324369g = fVar;
    }

    /* renamed from: f */
    public final void mo82222f(C90931ca caVar) {
        this.f324366d = caVar;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        synchronized (this.f324370h) {
            while (!this.f324371i.isEmpty()) {
                C60870cx cxVar = (C60870cx) this.f324371i.poll();
                cxVar.getClass();
                cxVar.cancel(true);
            }
        }
        synchronized (this) {
            BrainSuggestDecoder brainSuggestDecoder = this.f324367e;
            if (brainSuggestDecoder != null) {
                brainSuggestDecoder.clearCache();
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        C60870cx c;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f324370h) {
            while (this.f324371i.size() > 0) {
                C59104x c2 = f324363a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "sb.v.u.BrainSource");
                ((C59052c) ((C59052c) c2).mo56372aa(32480)).mo56389s("Error: Got new brain suggest request %s, cancelling the old one.", aVar);
                C60870cx cxVar = (C60870cx) this.f324371i.poll();
                cxVar.getClass();
                cxVar.cancel(true);
            }
            BrainSuggestDecoder brainSuggestDecoder = this.f324367e;
            brainSuggestDecoder.getClass();
            c = brainSuggestDecoder.f324354a.mo85138c(new C116872a(brainSuggestDecoder, aVar));
            this.f324371i.add(c);
        }
        C88568b.m143111a(c, this.f324371i, this.f324370h);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        r6 = r0.f239556a.mo84352bk();
        r0 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r0 < 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (java.lang.Character.isWhitespace(r6.charAt(r0)) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r0 < 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (java.lang.Character.isWhitespace(r6.charAt(r0)) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r0 < 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        r6 = r5.f324370h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5.f324371i.isEmpty() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r0 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        r0 = r5.f324371i.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        return false;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82238o(com.google.android.libraries.searchbox.shared.p3201b.C41642a r6) {
        /*
            r5 = this;
            r0 = r6
            com.google.android.apps.gsa.searchbox.c.t r0 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r0
            int r1 = r0.f239557b
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0084
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.f r1 = r5.f324369g
            monitor-enter(r1)
            boolean r4 = r1.f324372a     // Catch:{ all -> 0x0081 }
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0084
        L_0x0013:
            monitor-enter(r5)
            boolean r1 = r5.f324368f     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0062
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.BrainSuggestDecoder r6 = r5.f324367e     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x001e
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            return r2
        L_0x001e:
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.shared.search.Query r6 = r0.f239556a
            java.lang.String r6 = r6.mo84352bk()
            int r0 = r6.length()
        L_0x0029:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0038
            char r1 = r6.charAt(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L_0x0038
            goto L_0x0029
        L_0x0038:
            if (r0 < 0) goto L_0x0047
            char r1 = r6.charAt(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L_0x0047
            int r0 = r0 + -1
            goto L_0x0038
        L_0x0047:
            if (r0 < 0) goto L_0x0061
            java.lang.Object r6 = r5.f324370h
            monitor-enter(r6)
            java.util.LinkedList r0 = r5.f324371i     // Catch:{ all -> 0x005e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0056
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005e }
        L_0x0056:
            java.util.LinkedList r0 = r5.f324371i     // Catch:{ all -> 0x005e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005e }
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x0061:
            return r2
        L_0x0062:
            com.google.android.apps.gsa.searchbox.c.t r6 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r6     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.shared.search.Query r6 = r6.f239556a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.mo84352bk()     // Catch:{ all -> 0x007e }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x007c
            r5.f324368f = r3     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.shared.util.c.ca r6 = r5.f324366d     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.c r0 = new com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.c     // Catch:{ all -> 0x007e }
            r0.<init>(r5)     // Catch:{ all -> 0x007e }
            r6.mo85139d(r0)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            return r2
        L_0x007e:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            throw r6
        L_0x0081:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            throw r6
        L_0x0084:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.C116875d.mo82238o(com.google.android.libraries.searchbox.shared.b.a):boolean");
    }
}
