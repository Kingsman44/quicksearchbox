package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9541b;

import java.util.Collection;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.b.a */
/* compiled from: PG */
final class C127181a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Collection f350136a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127181a(Collection collection) {
        super(0);
        this.f350136a = collection;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo5672a() {
        /*
            r7 = this;
            com.google.common.b.gv r0 = new com.google.common.b.gv
            r0.<init>()
            java.util.Collection r1 = r7.f350136a
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.search.assistant.f.a.a.b r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b) r2
            com.google.android.libraries.search.assistant.f.a.d.cd r3 = r2.mo38174d()
            com.google.android.libraries.search.assistant.f.a.d.ar r3 = r3.f88043b
            if (r3 != 0) goto L_0x0021
            com.google.android.libraries.search.assistant.f.a.d.ar r3 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x0021:
            java.lang.String r4 = "provider.supportedContextKey.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.util.Set r4 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9541b.C127184d.f350143a
            int r5 = r3.f87975a
            r6 = 3
            if (r5 != r6) goto L_0x0036
            java.lang.Object r5 = r3.f87976b
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0045
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.PKG_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x0045:
            int r4 = r3.f87975a
            if (r4 != r6) goto L_0x005a
            java.lang.Object r4 = r3.f87976b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 436126002(0x19fec132, float:2.6341015E-23)
            if (r4 != r5) goto L_0x005a
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.APP_NAMES_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x005a:
            int r4 = r3.f87975a
            if (r4 != r6) goto L_0x006f
            java.lang.Object r4 = r3.f87976b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 450182934(0x1ad53f16, float:8.8196656E-23)
            if (r4 != r5) goto L_0x006f
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.ASSISTANT_HISTORY_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x006f:
            int r4 = r3.f87975a
            r5 = 1
            r6 = 0
            if (r4 != r5) goto L_0x00c9
            java.lang.Object r3 = r3.f87976b
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.hashCode()
            switch(r4) {
                case -1842768720: goto L_0x00bd;
                case -1414569725: goto L_0x00b1;
                case 3045982: goto L_0x00a5;
                case 92895825: goto L_0x0099;
                case 103772132: goto L_0x008d;
                case 110364485: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00c9
        L_0x0081:
            java.lang.String r4 = "timer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x008a
            goto L_0x00c9
        L_0x008a:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CLOCK_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x008d:
            java.lang.String r4 = "media"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0096
            goto L_0x00c9
        L_0x0096:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.MEDIA_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x0099:
            java.lang.String r4 = "alarm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a2
            goto L_0x00c9
        L_0x00a2:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CLOCK_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x00a5:
            java.lang.String r4 = "call"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ae
            goto L_0x00c9
        L_0x00ae:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CALL_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x00b1:
            java.lang.String r4 = "asst.communication.top_contact"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ba
            goto L_0x00c9
        L_0x00ba:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.CONTACT_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x00bd:
            java.lang.String r4 = "asst.device.properties"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            com.google.android.libraries.search.assistant.y.g.a.d r3 = com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d.DO_NOT_DISTURB_CONTEXT_CHANGE
            goto L_0x00ca
        L_0x00c9:
            r3 = r6
        L_0x00ca:
            if (r3 == 0) goto L_0x000b
            com.google.android.libraries.search.assistant.f.a.a.f r2 = r2.mo38173c()
            if (r2 == 0) goto L_0x000b
            r0.mo55419c(r3, r2)
            goto L_0x000b
        L_0x00d7:
            com.google.common.b.gw r0 = r0.mo55417a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9541b.C127181a.mo5672a():java.lang.Object");
    }
}
