package com.google.android.libraries.search.assistant.p2783s.p2785b;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;
import p5462h.p5480j.C69699g;

/* renamed from: com.google.android.libraries.search.assistant.s.b.n */
/* compiled from: PG */
public final class C36395n {

    /* renamed from: c */
    private static final C59071e f95040c = C59071e.m91331h();

    /* renamed from: a */
    public final Context f95041a;

    /* renamed from: b */
    public final C69585o f95042b;

    /* renamed from: d */
    private final C69464a f95043d;

    public C36395n(Context context, C69585o oVar, C69464a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(aVar, "connectivityCheckTimeout");
        this.f95041a = context;
        this.f95042b = oVar;
        this.f95043d = aVar;
    }

    /* renamed from: a */
    public final Optional mo40155a(String str) {
        if (str == null || str.length() < 3) {
            C59052c cVar = (C59052c) f95040c.mo56226d();
            cVar.mo56379ah(new C59094n(51434));
            cVar.mo56386p("extractMccMnc: value does not have sufficient length");
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "{\n      logger.atWarning…   Optional.empty()\n    }");
            return empty;
        }
        try {
            C69695c d = C69699g.m101122d(0, 3);
            C69664n.m101061g(d, "range");
            String substring = str.substring(Integer.valueOf(d.f186059a).intValue(), Integer.valueOf(d.f186060b).intValue() + 1);
            C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            String substring2 = str.substring(3);
            C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
            Optional of = Optional.m71637of(new C36384c(parseInt, Integer.parseInt(substring2)));
            C69664n.m101060f(of, "{\n        Optional.of(Mc…ring(3).toInt()))\n      }");
            return of;
        } catch (NumberFormatException e) {
            C59052c cVar2 = (C59052c) ((C59052c) f95040c.mo56226d()).mo56382g(e);
            cVar2.mo56379ah(new C59094n(51435));
            cVar2.mo56386p("extractMccMnc: invalid value");
            Optional empty2 = Optional.empty();
            C69664n.m101060f(empty2, "{\n        logger.atWarni… Optional.empty()\n      }");
            return empty2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40156b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.p2783s.p2785b.C36385d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.s.b.d r0 = (com.google.android.libraries.search.assistant.p2783s.p2785b.C36385d) r0
            int r1 = r0.f95015c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f95015c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.s.b.d r0 = new com.google.android.libraries.search.assistant.s.b.d
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f95013a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f95015c
            java.lang.String r3 = "Platform issue fetching ActiveNetworkType"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            p5462h.C69714l.m101134b(r8)     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            goto L_0x0058
        L_0x0029:
            r8 = move-exception
            goto L_0x005b
        L_0x002b:
            r8 = move-exception
            goto L_0x007a
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            g.a.a r8 = r7.f95043d     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            java.lang.Object r8 = r8.mo17428b()     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            java.lang.String r2 = "connectivityCheckTimeout.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            long r5 = r8.longValue()     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            com.google.android.libraries.search.assistant.s.b.e r8 = new com.google.android.libraries.search.assistant.s.b.e     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            r2 = 0
            r8.<init>(r7, r2)     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            r0.f95015c = r4     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            java.lang.Object r8 = kotlinx.coroutines.C71745ea.m104929a(r5, r8, r0)     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            com.google.speech.h.ak r8 = (com.google.speech.p5208h.C66554ak) r8     // Catch:{ dx -> 0x0099, SecurityException -> 0x002b, IllegalArgumentException -> 0x0029 }
            goto L_0x00b3
        L_0x005b:
            com.google.common.f.e r0 = f95040c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r8 = r0.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51438(0xc8ee, float:7.208E-41)
            r0.<init>(r1)
            r8.mo56379ah(r0)
            r8.mo56386p(r3)
            com.google.speech.h.ak r8 = com.google.speech.p5208h.C66554ak.UNKNOWN
            goto L_0x00b3
        L_0x007a:
            com.google.common.f.e r0 = f95040c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r8 = r0.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51437(0xc8ed, float:7.2079E-41)
            r0.<init>(r1)
            r8.mo56379ah(r0)
            r8.mo56386p(r3)
            com.google.speech.h.ak r8 = com.google.speech.p5208h.C66554ak.UNKNOWN
            goto L_0x00b3
        L_0x0099:
            com.google.common.f.e r8 = f95040c
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51436(0xc8ec, float:7.2077E-41)
            r0.<init>(r1)
            r8.mo56379ah(r0)
            java.lang.String r0 = "Timed out fetching ActiveNetworkType"
            r8.mo56386p(r0)
            com.google.speech.h.ak r8 = com.google.speech.p5208h.C66554ak.UNKNOWN
        L_0x00b3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36395n.mo40156b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40157c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.assistant.p2783s.p2785b.C36387f
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.assistant.s.b.f r0 = (com.google.android.libraries.search.assistant.p2783s.p2785b.C36387f) r0
            int r1 = r0.f95019c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f95019c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.s.b.f r0 = new com.google.android.libraries.search.assistant.s.b.f
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f95017a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f95019c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.assistant.s.b.m r5 = new com.google.android.libraries.search.assistant.s.b.m
            r2 = 0
            r5.<init>(r4, r2)
            r0.f95019c = r3
            java.lang.Object r5 = kotlinx.coroutines.C71423ax.m104196a(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.String r0 = "suspend fun mobileUserIn…     }\n      .build()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36395n.mo40157c(h.c.g):java.lang.Object");
    }
}
