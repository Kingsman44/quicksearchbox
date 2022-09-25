package com.google.android.libraries.assistant.soda.p1605d;

import android.app.Application;
import android.os.Build;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.p1635au.C19571h;
import com.google.android.libraries.p1635au.C19576m;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4575r.C60749f;
import com.google.speech.p5218j.C66926ep;
import com.google.speech.p5218j.C66928er;
import com.google.speech.p5218j.C66929es;
import com.google.speech.p5218j.C66931eu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.soda.d.s */
/* compiled from: PG */
public final class C19281s implements C19280r {

    /* renamed from: a */
    private static final C59071e f54001a = C59071e.m91332i("com.google.android.libraries.assistant.soda.d.s");

    /* renamed from: b */
    private static final String f54002b = Build.MODEL;

    /* renamed from: c */
    private final Application f54003c;

    /* renamed from: d */
    private final ScheduledExecutorService f54004d;

    /* renamed from: e */
    private C19268f f54005e;

    public C19281s(Application application, ScheduledExecutorService scheduledExecutorService) {
        this.f54003c = application;
        this.f54004d = scheduledExecutorService;
    }

    /* renamed from: c */
    private static double m36780c(C66929es esVar) {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        C66931eu euVar = esVar.f181928c;
        if (euVar == null) {
            euVar = C66931eu.f181932c;
        }
        return C60749f.m92726d((double) timeUnit.toMillis(euVar.f181934a == 2 ? ((Long) euVar.f181935b).longValue() : 0));
    }

    /* renamed from: d */
    private final synchronized C19268f m36781d() {
        if (this.f54005e == null) {
            ScheduledExecutorService scheduledExecutorService = this.f54004d;
            Application application = this.f54003c;
            this.f54005e = C19268f.m36761a(scheduledExecutorService, application, application);
        }
        return this.f54005e;
    }

    /* renamed from: e */
    private static String m36782e(C66929es esVar) {
        return "/client_streamz".concat(String.valueOf(esVar.f181930e));
    }

    /* renamed from: f */
    private static void m36783f(C19571h[] hVarArr, String[] strArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            C66926ep epVar = (C66926ep) list.get(i);
            hVarArr[i] = C19571h.m37328c(epVar.mo59749a());
            strArr[i] = epVar.mo59750b();
        }
    }

    /* renamed from: a */
    public final void mo24437a(C66929es esVar) {
        m36781d();
        if ((esVar.f181926a & 16) != 0) {
            C66931eu euVar = esVar.f181928c;
            if (euVar == null) {
                euVar = C66931eu.f181932c;
            }
            int i = 1;
            if (euVar.f181934a == 1) {
                int size = esVar.f181929d.size();
                C19571h[] hVarArr = new C19571h[size];
                String[] strArr = new String[size];
                m36783f(hVarArr, strArr, esVar.f181929d);
                C19567d c = C19576m.m37335e("soda_agsa").mo24833c(m36782e(esVar), hVarArr);
                C66931eu euVar2 = esVar.f181928c;
                if (euVar2 == null) {
                    euVar2 = C66931eu.f181932c;
                }
                c.mo24822a(euVar2.f181934a == 1 ? ((Long) euVar2.f181935b).longValue() : 0, (Object[]) strArr);
                String str = esVar.f181930e;
                C66931eu euVar3 = esVar.f181928c;
                if (euVar3 == null) {
                    euVar3 = C66931eu.f181932c;
                }
                if (euVar3.f181934a == 1) {
                    ((Long) euVar3.f181935b).longValue();
                }
                new C58827ar(",").mo56097d(Arrays.asList(strArr));
                return;
            }
            C66931eu euVar4 = esVar.f181928c;
            if ((euVar4 == null ? C66931eu.f181932c : euVar4).f181934a == 2) {
                int size2 = esVar.f181929d.size();
                C19571h[] hVarArr2 = new C19571h[size2];
                String[] strArr2 = new String[size2];
                m36783f(hVarArr2, strArr2, esVar.f181929d);
                C19576m.m37335e("soda_agsa").mo24834d(m36782e(esVar), hVarArr2).mo24824b(m36780c(esVar), (Object[]) strArr2);
                String str2 = esVar.f181930e;
                m36780c(esVar);
                new C58827ar(",").mo56097d(Arrays.asList(strArr2));
                return;
            }
            if (euVar4 == null) {
                euVar4 = C66931eu.f181932c;
            }
            if (euVar4.f181934a == 3) {
                int size3 = esVar.f181929d.size();
                C19571h[] hVarArr3 = new C19571h[size3];
                String[] strArr3 = new String[size3];
                m36783f(hVarArr3, strArr3, esVar.f181929d);
                C19569f d = C19576m.m37335e("soda_agsa").mo24834d(m36782e(esVar), hVarArr3);
                C66931eu euVar5 = esVar.f181928c;
                if (euVar5 == null) {
                    euVar5 = C66931eu.f181932c;
                }
                d.mo24824b(euVar5.f181934a == 3 ? ((Double) euVar5.f181935b).doubleValue() : C59203do.f157270a, (Object[]) strArr3);
                String str3 = esVar.f181930e;
                C66931eu euVar6 = esVar.f181928c;
                if (euVar6 == null) {
                    euVar6 = C66931eu.f181932c;
                }
                if (euVar6.f181934a == 3) {
                    ((Double) euVar6.f181935b).doubleValue();
                }
                new C58827ar(",").mo56097d(Arrays.asList(strArr3));
                return;
            }
            C59052c cVar = (C59052c) ((C59052c) f54001a.mo56226d()).mo56372aa(47699);
            int a = C66928er.m97384a(esVar.f181927b);
            if (a != 0) {
                i = a;
            }
            cVar.mo56387q("Unhandled metrics event: %d", i - 1);
        }
    }

    /* renamed from: b */
    public final void mo24438b(int i) {
        if (i == 0) {
            C19268f d = m36781d();
            ((C19567d) d.f53979c.mo6453a()).mo24822a(1, f54002b);
        } else if (i == 1) {
            C19268f d2 = m36781d();
            ((C19567d) d2.f53982f.mo6453a()).mo24822a(1, f54002b);
        } else if (i != 2) {
            C19268f d3 = m36781d();
            ((C19567d) d3.f53981e.mo6453a()).mo24822a(1, f54002b);
        } else {
            C19268f d4 = m36781d();
            ((C19567d) d4.f53980d.mo6453a()).mo24822a(1, f54002b);
        }
    }
}
