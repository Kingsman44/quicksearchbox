package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.content.Context;
import android.util.Pair;
import androidx.work.C4377aa;
import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.C4645z;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C4452ag;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.privatetelemetry.tqcobalt.jni.C32026a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2448a.C32002a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2448a.C32003b;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32021d;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32023a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32024b;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32025c;
import com.google.android.p10713e.C142537c;
import com.google.android.p10713e.C142538d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4744p.C62872b;
import com.google.protobuf.C63088z;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class LogUploader extends Worker {

    /* renamed from: b */
    private static final C59071e f86056b = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogUploader");

    /* renamed from: g */
    private static final C4377aa f86057g = new C4645z(C4632m.f14549a);

    /* renamed from: h */
    private final C32026a f86058h;

    /* renamed from: i */
    private final C32003b f86059i;

    /* renamed from: j */
    private final C32021d f86060j;

    /* renamed from: k */
    private final C32012f f86061k;

    /* renamed from: l */
    private final C32025c f86062l;

    /* renamed from: m */
    private final C32027a f86063m;

    /* renamed from: n */
    private final C21370a f86064n;

    public LogUploader(Context context, WorkerParameters workerParameters, C32021d dVar, C32003b bVar, C32026a aVar, C32025c cVar, C21370a aVar2) {
        super(context, workerParameters);
        this.f86060j = dVar;
        C32012f a = dVar.mo37787a();
        this.f86061k = a;
        this.f86058h = aVar;
        this.f86059i = bVar;
        this.f86063m = new C32027a(context, a);
        this.f86062l = cVar;
        this.f86064n = aVar2;
    }

    /* renamed from: f */
    public static C4383ag m59684f(String str) {
        C4382af afVar = new C4382af(LogUploader.class);
        afVar.mo9338c(str);
        return (C4383ag) afVar.mo9337b();
    }

    /* renamed from: g */
    private final void m59685g(Map map, int i) {
        Optional empty;
        String str;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Integer) ((Pair) entry.getKey()).first).intValue();
            int intValue2 = ((Integer) ((Pair) entry.getKey()).second).intValue();
            long longValue = ((Long) entry.getValue()).longValue();
            int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
            int i2 = 0;
            while (true) {
                if (i2 < 42) {
                    int i3 = iArr[i2];
                    switch (i3) {
                        case 1:
                            str = "OTHER";
                            break;
                        case 2:
                            str = "_2147483647_205836624";
                            break;
                        case 3:
                            str = "_1_929352809";
                            break;
                        case 4:
                            str = "_1_657579885";
                            break;
                        case 5:
                            str = "_1_7";
                            break;
                        case 6:
                            str = "_1_2322225253";
                            break;
                        case 7:
                            str = "_1_4";
                            break;
                        case 8:
                            str = "_1_5";
                            break;
                        case 9:
                            str = "_1_3708719327";
                            break;
                        case 10:
                            str = "_1_4228153068";
                            break;
                        case 11:
                            str = "_1_2";
                            break;
                        case 12:
                            str = "_1_2820332838";
                            break;
                        case 13:
                            str = "_1_1334068210";
                            break;
                        case 14:
                            str = "_1_3676913920";
                            break;
                        case 15:
                            str = "_1_285903809";
                            break;
                        case 16:
                            str = "_1_3142410971";
                            break;
                        case 17:
                            str = "_1_3509424520";
                            break;
                        case 18:
                            str = "_1_2165403525";
                            break;
                        case 19:
                            str = "_1_1";
                            break;
                        case 20:
                            str = "_1_3";
                            break;
                        case 21:
                            str = "_1_2550112954";
                            break;
                        case 22:
                            str = "_1_4247972873";
                            break;
                        case 23:
                            str = "_1_6";
                            break;
                        case 24:
                            str = "_1_8";
                            break;
                        case 25:
                            str = "_1_9";
                            break;
                        case 26:
                            str = "_1_10";
                            break;
                        case 27:
                            str = "_1_11";
                            break;
                        case 28:
                            str = "_1_12";
                            break;
                        case 29:
                            str = "_1_13";
                            break;
                        case 30:
                            str = "_1_14";
                            break;
                        case 31:
                            str = "_1_15";
                            break;
                        case 32:
                            str = "_1_16";
                            break;
                        case 33:
                            str = "_100000_1";
                            break;
                        case 34:
                            str = "_100000_2";
                            break;
                        case 35:
                            str = "_100000_3";
                            break;
                        case 36:
                            str = "_200000_1";
                            break;
                        case 37:
                            str = "_200000_2";
                            break;
                        case 38:
                            str = "_200000_3";
                            break;
                        case 39:
                            str = "_200001_1";
                            break;
                        case 40:
                            str = "_299999_1";
                            break;
                        case 41:
                            str = "_200001_2";
                            break;
                        case 42:
                            str = "_200001_3";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    if (i3 != 0) {
                        if (str.equals("_" + intValue + "_" + intValue2)) {
                            empty = Optional.m71637of(Integer.valueOf(i3 - 1));
                        } else {
                            i2++;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    empty = Optional.empty();
                }
            }
            if (empty.isEmpty()) {
                ((C59052c) ((C59052c) f86056b.mo56226d()).mo56372aa(50497)).mo56393w("Cobalt: failed to find code for PerProjectBytesUploadedMigrated metrics for customer id = %d, project id = %d", intValue, intValue2);
            } else {
                C142537c cVar = (C142537c) C142538d.f386774q.createBuilder();
                cVar.copyOnWrite();
                ((C142538d) cVar.instance).f386778c = Integer.MAX_VALUE;
                cVar.copyOnWrite();
                ((C142538d) cVar.instance).f386779d = 205836624;
                cVar.copyOnWrite();
                ((C142538d) cVar.instance).f386780e = 17;
                cVar.mo117140a(((Integer) empty.get()).intValue());
                cVar.mo117140a(i);
                cVar.copyOnWrite();
                C142538d dVar = (C142538d) cVar.instance;
                dVar.f386776a = 12;
                dVar.f386777b = Long.valueOf(longValue);
                m59688j((C142538d) cVar.build(), 2);
            }
        }
    }

    /* renamed from: h */
    private final void m59686h(int i) {
        C142537c cVar = (C142537c) C142538d.f386774q.createBuilder();
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386778c = 299999;
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386779d = 1;
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386780e = 3;
        cVar.mo117140a(this.f86061k.mo37777a());
        cVar.mo117140a((int) this.f86061k.mo37778b());
        cVar.mo117140a(i);
        cVar.copyOnWrite();
        C142538d dVar = (C142538d) cVar.instance;
        dVar.f386776a = 11;
        dVar.f386777b = 1L;
        m59688j((C142538d) cVar.build(), 1);
    }

    /* renamed from: i */
    private final boolean m59687i(long j) {
        return this.f86064n.mo26870b() - j > 259200000;
    }

    /* renamed from: j */
    private final void m59688j(C142538d dVar, int i) {
        C32043e.m59710d(C4452ag.m12686j(this.f13999c), LogWriter.m59690c(dVar, i, C32043e.m59708b(this.f86061k.mo37777a(), this.f86061k.mo37778b())), this.f86061k.mo37777a(), this.f86061k.mo37778b());
    }

    /* renamed from: c */
    public final C4377aa mo9300c() {
        C32024b bVar;
        C59071e eVar = f86056b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(50488)).mo56386p("Cobalt: start sending logs to the Cobalt Server");
        if (!this.f86060j.mo37790d()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(50489)).mo56386p("Cobalt: logger is disabled, canceling this task");
            long l = this.f14000d.f13989b.mo9572l(this.f86064n.mo26870b());
            if (m59687i(l)) {
                C4452ag.m12686j(this.f13999c).mo9328b(C32043e.m59709c(this.f86061k.mo37777a(), this.f86061k.mo37778b()));
                C32027a aVar = this.f86063m;
                aVar.mo37811a(new File(aVar.f86076a));
                aVar.mo37812b();
                for (File d : C32027a.m59692c(aVar.f86077b)) {
                    C32027a.m59693d(d);
                }
                C32027a.m59693d(new File(aVar.f86078c));
                C32027a.m59693d(new File(aVar.f86079d));
                C32027a.m59693d(new File(aVar.f86080e));
                ((C59052c) ((C59052c) f86056b.mo56226d()).mo56372aa(50490)).mo56386p("Cobalt: cleared data from the data store");
            }
            HashMap hashMap = new HashMap();
            C4631l.m13034e(l, hashMap);
            return new C4645z(C4631l.m13030a(hashMap));
        }
        C4452ag j = C4452ag.m12686j(this.f13999c);
        int a = this.f86061k.mo37777a();
        long b = this.f86061k.mo37778b();
        j.mo9331e(C32043e.m59709c(a, b), C4634o.REPLACE, LogUploadTimer.m59682f(a, b, this.f86060j.mo37788b()));
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(50491)).mo56394x("Cobalt: start uploading logic for customerId = %d, projectId = %d", this.f86061k.mo37777a(), this.f86061k.mo37778b());
        try {
            C32027a aVar2 = this.f86063m;
            C32012f fVar = this.f86061k;
            C142538d dVar = C142538d.f386774q;
            C142537c cVar = (C142537c) dVar.createBuilder(dVar);
            C63088z b2 = C32040b.m59704b(fVar.mo37779c());
            cVar.copyOnWrite();
            ((C142538d) cVar.instance).f386782g = b2;
            String d2 = C32040b.m59706d(aVar2.f86078c);
            cVar.copyOnWrite();
            d2.getClass();
            ((C142538d) cVar.instance).f386783h = d2;
            String d3 = C32040b.m59706d(aVar2.f86080e);
            cVar.copyOnWrite();
            d3.getClass();
            ((C142538d) cVar.instance).f386787l = d3;
            String c = C32040b.m59705c(aVar2.f86076a);
            cVar.copyOnWrite();
            c.getClass();
            ((C142538d) cVar.instance).f386785j = c;
            String d4 = C32040b.m59706d(aVar2.f86079d);
            cVar.copyOnWrite();
            d4.getClass();
            ((C142538d) cVar.instance).f386784i = d4;
            String c2 = C32040b.m59705c(aVar2.f86077b);
            cVar.copyOnWrite();
            c2.getClass();
            ((C142538d) cVar.instance).f386786k = c2;
            try {
                int a2 = this.f86058h.mo37805a(((C142538d) cVar.build()).toByteArray());
                this.f86063m.mo37812b();
                for (File file : C32027a.m59692c(this.f86063m.f86077b)) {
                    if (m59687i(file.lastModified())) {
                        C32027a.m59693d(file);
                    } else {
                        try {
                            ((C59052c) ((C59052c) f86056b.mo56224b()).mo56372aa(50495)).mo56389s("Cobalt: build Envelope for file %s", file.getAbsolutePath());
                            bVar = this.f86062l.mo37804a(file);
                        } catch (Throwable th) {
                            ((C59052c) ((C59052c) ((C59052c) f86056b.mo56225c()).mo56382g(th)).mo56372aa(50496)).mo56389s("Cobalt: couldn't build Envelope for file %s", file.getAbsolutePath());
                            bVar = C32024b.m59664e(4);
                        }
                        C32023a aVar3 = (C32023a) bVar;
                        int i = aVar3.f86050d;
                        int i2 = 2;
                        if (i != 1) {
                            int i3 = i - 1;
                            if (i3 == 1) {
                                i2 = 3;
                            } else if (i3 == 2) {
                                i2 = 5;
                            }
                            m59686h(i2);
                        } else {
                            if (aVar3.f86049c) {
                                ((C59052c) ((C59052c) f86056b.mo56224b()).mo56372aa(50498)).mo56389s("Cobalt: data from file %s formed empty envelope", file.getAbsolutePath());
                            } else {
                                m59685g(aVar3.f86048b, 1);
                                C32003b bVar2 = this.f86059i;
                                C62872b bVar3 = aVar3.f86047a;
                                ((C59052c) ((C59052c) C32003b.f86002a.mo56224b()).mo56372aa(50472)).mo56389s("Cobalt: start uploading logs to Clearcut log_source = %s", bVar2.f86003b.f389487n);
                                bVar2.f86003b.mo118999d(bVar3).mo118992a().mo117321f(new C32002a(bVar2));
                                m59685g(aVar3.f86048b, 2);
                                m59686h(0);
                            }
                            C32027a.m59693d(file);
                        }
                    }
                }
                ((C59052c) ((C59052c) f86056b.mo56224b()).mo56372aa(50492)).mo56394x("Cobalt: finished sending logs to the Cobalt Server for customerId = %d, projectId = %d", this.f86061k.mo37777a(), this.f86061k.mo37778b());
                HashMap hashMap2 = new HashMap();
                C4631l.m13033d("com.google.android.libraries.privatetelemetry.tqcobalt.worker.uploader.STATUS", a2, hashMap2);
                return new C4645z(C4631l.m13030a(hashMap2));
            } catch (Throwable th2) {
                ((C59052c) ((C59052c) ((C59052c) f86056b.mo56225c()).mo56382g(th2)).mo56372aa(50493)).mo56386p("Cobalt: error while generating observations via C++ code");
                m59686h(1);
                return f86057g;
            }
        } catch (Throwable th3) {
            ((C59052c) ((C59052c) ((C59052c) f86056b.mo56225c()).mo56382g(th3)).mo56372aa(50494)).mo56386p("Cobalt: couldn't read configuration for Cobalt Service");
            return f86057g;
        }
    }
}
