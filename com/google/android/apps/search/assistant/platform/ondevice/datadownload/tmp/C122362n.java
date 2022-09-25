package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3604b.C46064e;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.n */
/* compiled from: PG */
public final class C122362n implements C47102r {

    /* renamed from: a */
    public static final C59071e f339260a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.n");

    /* renamed from: b */
    private final C68214a f339261b;

    /* renamed from: c */
    private final C46064e f339262c;

    /* renamed from: d */
    private final AccountId f339263d;

    /* renamed from: e */
    private final C60887da f339264e;

    public C122362n(C68214a aVar, C46064e eVar, AccountId accountId, C60887da daVar) {
        this.f339261b = aVar;
        this.f339262c = eVar;
        this.f339263d = accountId;
        this.f339264e = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo105606a(Context context, String str, Locale locale) {
        C60870cx b = this.f339262c.mo50182b(new Intent(str).setClass(context, TemporaryModelPromptReceiver_Receiver.class).putExtra("locale", locale.toLanguageTag()), this.f339263d);
        C122361m mVar = new C122361m(context, str);
        return C60922j.m93044g(b, C47810es.m84963c(mVar), this.f339264e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r6, int r7) {
        /*
            r5 = this;
            com.google.common.f.e r7 = f339260a
            com.google.common.f.x r0 = r7.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 34752(0x87c0, float:4.8698E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = r6.getAction()
            java.lang.String r2 = "locale"
            java.lang.String r3 = r6.getStringExtra(r2)
            java.lang.String r4 = "Received notification confirmation for action %s and locale %s"
            r0.mo56354G(r4, r1, r3)
            java.lang.String r0 = r6.getAction()
            if (r0 != 0) goto L_0x0035
            com.google.common.f.x r6 = r7.mo56226d()
            java.lang.String r7 = "Null action"
            r0 = 34755(0x87c3, float:4.8702E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            return r6
        L_0x0035:
            java.lang.String r6 = r6.getStringExtra(r2)
            if (r6 != 0) goto L_0x004a
            com.google.common.f.x r6 = r7.mo56226d()
            java.lang.String r7 = "Null locale"
            r0 = 34754(0x87c2, float:4.8701E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            return r6
        L_0x004a:
            int r1 = r0.hashCode()
            r2 = -1147298034(0xffffffffbb9d9f0e, float:-0.0048102206)
            r3 = 1
            if (r1 == r2) goto L_0x0064
            r2 = 901378541(0x35b9f1ed, float:1.3853984E-6)
            if (r1 == r2) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            java.lang.String r1 = "com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.DOWNLOAD_DATA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006e
            r0 = 0
            goto L_0x006f
        L_0x0064:
            java.lang.String r1 = "com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.CANCEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = -1
        L_0x006f:
            if (r0 == 0) goto L_0x00ae
            if (r0 == r3) goto L_0x0082
            com.google.common.f.x r6 = r7.mo56226d()
            java.lang.String r7 = "Unknown action"
            r0 = 34753(0x87c1, float:4.87E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            return r6
        L_0x0082:
            dagger.a r6 = r5.f339261b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.an r6 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122348an) r6
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122348an.f339226a
            com.google.common.f.x r7 = r7.mo56224b()
            j$.util.Optional r0 = r6.f339234i
            boolean r0 = r0.isPresent()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = 34757(0x87c5, float:4.8705E-41)
            java.lang.String r2 = "Cancel signal received. Cancelling = %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56389s(r2, r0)
            j$.util.Optional r7 = r6.f339234i
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.y r0 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122373y.f339282a
            r7.ifPresent(r0)
            r6.f339235j = r3
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            return r6
        L_0x00ae:
            dagger.a r7 = r5.f339261b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.an r7 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122348an) r7
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)
            boolean r0 = r7.mo105601c()
            if (r0 == 0) goto L_0x00d1
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122348an.f339226a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Download already in progress, not starting download."
            r0 = 34764(0x87cc, float:4.8715E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x00fe
        L_0x00d1:
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.a r0 = r7.f339227b
            com.google.common.util.concurrent.cx r0 = r0.mo105598a(r6)
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.a r1 = r7.f339227b
            com.google.common.util.concurrent.cx r1 = r1.mo105599b(r6)
            com.google.android.libraries.mdi.download.av r2 = com.google.android.libraries.mdi.download.C28716av.f78018d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.mdi.download.as r2 = (com.google.android.libraries.mdi.download.C28713as) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.mdi.download.av r4 = (com.google.android.libraries.mdi.download.C28716av) r4
            r4.f78022c = r3
            int r3 = r4.f78020a
            r3 = r3 | 2
            r4.f78020a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.mdi.download.av r2 = (com.google.android.libraries.mdi.download.C28716av) r2
            com.google.common.util.concurrent.cx r6 = r7.mo105600a(r6, r0, r1, r2)
        L_0x00fe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.C122362n.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
