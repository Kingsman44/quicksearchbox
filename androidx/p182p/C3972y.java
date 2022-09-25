package androidx.p182p;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.p054b.p055a.p057b.C0894h;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4057l;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.y */
/* compiled from: PG */
public final class C3972y {

    /* renamed from: j */
    private static final String[] f12677j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final C3925ah f12678a;

    /* renamed from: b */
    public C3938c f12679b;

    /* renamed from: c */
    public final AtomicBoolean f12680c = new AtomicBoolean(false);

    /* renamed from: d */
    public volatile boolean f12681d;

    /* renamed from: e */
    public volatile C4057l f12682e;

    /* renamed from: f */
    public final C0894h f12683f;

    /* renamed from: g */
    public C3973z f12684g;

    /* renamed from: h */
    public final Object f12685h;

    /* renamed from: i */
    public final Runnable f12686i;

    /* renamed from: k */
    private final Map f12687k;

    /* renamed from: l */
    private final Map f12688l;

    /* renamed from: m */
    private final String[] f12689m;

    /* renamed from: n */
    private final C3969v f12690n;

    /* renamed from: o */
    private final Object f12691o;

    public C3972y(C3925ah ahVar, Map map, String... strArr) {
        String str;
        this.f12678a = ahVar;
        this.f12687k = map;
        int length = strArr.length;
        this.f12690n = new C3969v(length);
        C69664n.m101060f(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f12683f = new C0894h();
        this.f12691o = new Object();
        this.f12685h = new Object();
        this.f12688l = new LinkedHashMap();
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            C69664n.m101060f(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f12688l.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f12687k.get(strArr[i]);
            if (str3 != null) {
                Locale locale2 = Locale.US;
                C69664n.m101060f(locale2, "US");
                str = str3.toLowerCase(locale2);
                C69664n.m101060f(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f12689m = strArr2;
        for (Map.Entry entry : this.f12687k.entrySet()) {
            Locale locale3 = Locale.US;
            C69664n.m101060f(locale3, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale3);
            C69664n.m101060f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f12688l.containsKey(lowerCase2)) {
                Locale locale4 = Locale.US;
                C69664n.m101060f(locale4, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale4);
                C69664n.m101060f(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map2 = this.f12688l;
                map2.put(lowerCase3, C69505av.m100865g(map2, lowerCase2));
            }
        }
        this.f12686i = new C3971x(this);
    }

    /* renamed from: a */
    public final void mo8311a() {
        synchronized (this.f12685h) {
            this.f12681d = false;
            C3969v vVar = this.f12690n;
            synchronized (vVar) {
                Arrays.fill(vVar.f12673b, false);
                vVar.f12675d = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo8312b(C4049d dVar) {
        int i;
        int[] iArr;
        C4049d dVar2 = dVar;
        C69664n.m101061g(dVar2, "database");
        if (!dVar.mo8251j()) {
            try {
                Lock Q = this.f12678a.mo8173Q();
                Q.lock();
                try {
                    synchronized (this.f12691o) {
                        C3969v vVar = this.f12690n;
                        synchronized (vVar) {
                            if (!vVar.f12675d) {
                                iArr = null;
                                i = 0;
                            } else {
                                long[] jArr = vVar.f12672a;
                                int length = jArr.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length) {
                                    long j = jArr[i2];
                                    int i4 = i3 + 1;
                                    boolean z = j > 0;
                                    boolean[] zArr = vVar.f12673b;
                                    if (z != zArr[i3]) {
                                        vVar.f12674c[i3] = j > 0 ? 1 : 2;
                                    } else {
                                        vVar.f12674c[i3] = 0;
                                    }
                                    zArr[i3] = z;
                                    i2++;
                                    i3 = i4;
                                }
                                i = 0;
                                vVar.f12675d = false;
                                iArr = (int[]) vVar.f12674c.clone();
                            }
                        }
                        if (iArr != null) {
                            C69664n.m101061g(dVar2, "database");
                            if (dVar.mo8253l()) {
                                dVar.mo8247f();
                            } else {
                                dVar.mo8246e();
                            }
                            try {
                                int length2 = iArr.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length2) {
                                    int i7 = iArr[i5];
                                    int i8 = i6 + 1;
                                    if (i7 == 1) {
                                        dVar2.mo8249h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)");
                                        String str = this.f12689m[i6];
                                        String[] strArr = f12677j;
                                        for (int i9 = 3; i < i9; i9 = 3) {
                                            String str2 = strArr[i];
                                            dVar2.mo8249h("CREATE TEMP TRIGGER IF NOT EXISTS " + C3968u.m11341a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i6 + " AND invalidated = 0; END");
                                            i++;
                                            iArr = iArr;
                                        }
                                    } else if (i7 == 2) {
                                        String str3 = this.f12689m[i6];
                                        String[] strArr2 = f12677j;
                                        for (int i10 = 0; i10 < 3; i10++) {
                                            dVar2.mo8249h("DROP TRIGGER IF EXISTS ".concat(C3968u.m11341a(str3, strArr2[i10])));
                                        }
                                    }
                                    i5++;
                                    i6 = i8;
                                    iArr = iArr;
                                    i = 0;
                                }
                                dVar.mo8250i();
                                Q.unlock();
                            } finally {
                                dVar.mo8248g();
                            }
                        }
                    }
                } finally {
                    Q.unlock();
                }
            } catch (IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (SQLiteException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        }
    }
}
