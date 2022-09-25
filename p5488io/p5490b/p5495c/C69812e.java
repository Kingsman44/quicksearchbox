package p5488io.p5490b.p5495c;

import com.evernote.android.state.BuildConfig;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.b.c.e */
/* compiled from: PG */
public final class C69812e extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a */
    private final List f186195a;

    /* renamed from: b */
    private final String f186196b;

    /* renamed from: c */
    private Throwable f186197c;

    public C69812e(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof C69812e) {
                    linkedHashSet.addAll(((C69812e) th).f186195a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f186195a = unmodifiableList;
            int size = unmodifiableList.size();
            this.f186196b = size + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private final void m101290a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m101290a(sb, th.getCause(), BuildConfig.FLAVOR);
        }
    }

    /* renamed from: b */
    private final void m101291b(C69809b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f186195a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m101290a(sb, a, "\t");
            i++;
        }
        bVar.mo61468a(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(1:(1:12)(1:(2:13|(1:16)(1:49))))(0)|17|(4:20|(2:22|51)(2:23|52)|50|18)|24|25|26|27|(1:(2:30|(1:33)(1:47)))(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f186197c     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x007f
            io.b.c.a r0 = new io.b.c.a     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0083 }
            r1.<init>()     // Catch:{ all -> 0x0083 }
            java.util.List r2 = r8.f186195a     // Catch:{ all -> 0x0083 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0083 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0083 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0083 }
            r5.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x0046
            if (r6 != r4) goto L_0x0039
            goto L_0x0046
        L_0x0039:
            r5.add(r6)     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0046
            if (r7 == r6) goto L_0x0046
            r6 = r7
            goto L_0x0039
        L_0x0046:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0083 }
        L_0x004a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0083 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0083 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0064
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0083 }
            goto L_0x004a
        L_0x0064:
            r1.add(r6)     // Catch:{ all -> 0x0083 }
            goto L_0x004a
        L_0x0068:
            r3.initCause(r4)     // Catch:{ all -> 0x006b }
        L_0x006b:
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x0016
            if (r3 == r4) goto L_0x0016
        L_0x0073:
            r3 = r4
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x0016
            if (r4 == r3) goto L_0x0016
            goto L_0x0073
        L_0x007d:
            r8.f186197c = r0     // Catch:{ all -> 0x0083 }
        L_0x007f:
            java.lang.Throwable r0 = r8.f186197c     // Catch:{ all -> 0x0083 }
            monitor-exit(r8)
            return r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5495c.C69812e.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.f186196b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m101291b(new C69810c(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m101291b(new C69811d(printWriter));
    }
}
