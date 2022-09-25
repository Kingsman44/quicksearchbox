package org.chromium.net.impl;

import android.net.TrafficStats;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: org.chromium.net.impl.ce */
/* compiled from: PG */
final class C72499ce extends C72510cp {

    /* renamed from: a */
    public static final String f192892a = "ce";

    /* renamed from: b */
    public final C72495ca f192893b;

    /* renamed from: c */
    public final Executor f192894c;

    /* renamed from: d */
    public final String f192895d;

    /* renamed from: e */
    public final Map f192896e = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: f */
    public final List f192897f = new ArrayList();

    /* renamed from: g */
    public final AtomicInteger f192898g = new AtomicInteger(0);

    /* renamed from: h */
    public final boolean f192899h;

    /* renamed from: i */
    public String f192900i;

    /* renamed from: j */
    public C72520cz f192901j;

    /* renamed from: k */
    public Executor f192902k;

    /* renamed from: l */
    public volatile int f192903l = -1;

    /* renamed from: m */
    public String f192904m;

    /* renamed from: n */
    public ReadableByteChannel f192905n;

    /* renamed from: o */
    public C72513cs f192906o;

    /* renamed from: p */
    public String f192907p;

    /* renamed from: q */
    public HttpURLConnection f192908q;

    /* renamed from: r */
    public C72496cb f192909r;

    /* renamed from: s */
    public final int f192910s;

    /* renamed from: t */
    public final C72539u f192911t;

    /* renamed from: u */
    private final AtomicBoolean f192912u = new AtomicBoolean(false);

    public C72499ce(C72461au auVar, UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        this.f192899h = z;
        this.f192893b = new C72495ca(this, callback, executor2);
        this.f192894c = new C72498cd(new C72477bj(executor, !z2 ? TrafficStats.getThreadStatsTag() : i, z3, i2));
        this.f192910s = auVar.f192817a;
        this.f192911t = auVar.f192818b;
        this.f192904m = str;
        this.f192895d = str2;
    }

    /* renamed from: b */
    static long m107195b(Map map) {
        long j = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                j += (long) str.length();
            }
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                j += (long) str2.length();
            }
        }
        return j;
    }

    /* renamed from: c */
    static long m107196c(Map map) {
        long j = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                j += (long) str.length();
            }
            if (entry.getValue() != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        j += (long) str2.length();
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: n */
    private final void m107197n() {
        int i = this.f192898g.get();
        if (i != 0) {
            throw new IllegalStateException("Request is already started. State is: " + i);
        }
    }

    /* renamed from: a */
    public final void mo64173a(String str, String str2) {
        m107197n();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                    switch (charAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i++;
                                            }
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.f192896e.containsKey(str)) {
                    this.f192896e.remove(str);
                }
                this.f192896e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public final void cancel() {
        int andSet = this.f192898g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            mo64249j();
            mo64248i();
            C72495ca caVar = this.f192893b;
            C72513cs csVar = this.f192906o;
            caVar.f192881d.mo64245d();
            caVar.f192879b.execute(new C72491bx(caVar, csVar));
        }
    }

    /* renamed from: d */
    public final void mo64245d() {
        this.f192894c.execute(new C72476bi(this));
    }

    /* renamed from: e */
    public final void mo64246e(CronetException cronetException) {
        int i;
        do {
            i = this.f192898g.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!this.f192898g.compareAndSet(i, 6));
        mo64249j();
        mo64248i();
        C72495ca caVar = this.f192893b;
        C72513cs csVar = this.f192906o;
        caVar.f192881d.mo64245d();
        C72493bz bzVar = new C72493bz(caVar, csVar, cronetException);
        try {
            caVar.f192879b.execute(bzVar);
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = caVar.f192880c;
            if (executor != null) {
                executor.execute(bzVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo64247f(Throwable th) {
        mo64246e(new C72494c("Exception received from UploadDataProvider", th));
    }

    public final void followRedirect() {
        mo64252m(3, 1, new C72479bl(this));
    }

    /* renamed from: g */
    public final void mo64179g(String str) {
        m107197n();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.f192900i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method ".concat(str));
    }

    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.f192898g.get();
        int i2 = this.f192903l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + i);
        }
        this.f192893b.f192879b.execute(new C72487bt(new VersionSafeCallbacks$UrlRequestStatusListener(statusListener), i2));
    }

    /* renamed from: h */
    public final void mo64180h(UploadDataProvider uploadDataProvider, Executor executor) {
        if (this.f192896e.containsKey("Content-Type")) {
            m107197n();
            if (this.f192900i == null) {
                this.f192900i = "POST";
            }
            this.f192901j = new C72520cz(uploadDataProvider);
            if (this.f192899h) {
                this.f192902k = executor;
            } else {
                this.f192902k = new C72502ch(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    /* renamed from: i */
    public final void mo64248i() {
        if (this.f192901j != null && this.f192912u.compareAndSet(false, true)) {
            try {
                this.f192902k.execute(new C72472be(this, new C72481bn(this)));
            } catch (RejectedExecutionException e) {
                Log.e(f192892a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public final boolean isDone() {
        int i = this.f192898g.get();
        return i == 7 || i == 6 || i == 8;
    }

    /* renamed from: j */
    public final void mo64249j() {
        this.f192894c.execute(new C72475bh(this));
    }

    /* renamed from: k */
    public final void mo64250k() {
        this.f192903l = 13;
        this.f192894c.execute(new C72485br(this, new C72480bm(this)));
    }

    /* renamed from: l */
    public final void mo64251l() {
        this.f192894c.execute(new C72485br(this, new C72484bq(this)));
    }

    /* renamed from: m */
    public final void mo64252m(int i, int i2, Runnable runnable) {
        if (!this.f192898g.compareAndSet(i, i2)) {
            int i3 = this.f192898g.get();
            if (i3 != 8 && i3 != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + i3);
            }
            return;
        }
        runnable.run();
    }

    public final void read(ByteBuffer byteBuffer) {
        C72507cm.m107214a(byteBuffer);
        C72507cm.m107215b(byteBuffer);
        mo64252m(4, 5, new C72474bg(this, byteBuffer));
    }

    public final void start() {
        this.f192903l = 10;
        mo64252m(0, 1, new C72478bk(this));
    }
}
