package com.google.android.libraries.gsa.p1934s3.lib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.speech.p7294j.C92434d;
import com.google.android.libraries.gsa.p1934s3.producers.C23332b;
import com.google.android.libraries.gsa.p1934s3.producers.C23334d;
import com.google.android.libraries.gsa.p1934s3.producers.MutatableS3HeaderProducer;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.util.UUID;

@ProguardMustNotDelete
/* renamed from: com.google.android.libraries.gsa.s3.lib.AudioS3RequestProducerFactory */
/* compiled from: PG */
public class AudioS3RequestProducerFactory {

    /* renamed from: f */
    private static final C59071e f63841f = C59071e.m91332i("com.google.android.libraries.gsa.s3.lib.AudioS3RequestProducerFactory");

    /* renamed from: a */
    protected final Context f63842a;

    /* renamed from: b */
    protected final C58881cr f63843b;

    /* renamed from: c */
    protected final C67451at f63844c;

    /* renamed from: d */
    public final int f63845d;

    /* renamed from: e */
    protected final C23327c f63846e;

    /* renamed from: g */
    private final String f63847g;

    /* renamed from: h */
    private final String f63848h;

    /* renamed from: i */
    private final int f63849i;

    @ProguardMustNotDelete
    public AudioS3RequestProducerFactory(Context context, C23332b bVar, String str, C92434d dVar, C90758bb bbVar, C67451at atVar, int i, int i2, C90476a aVar) {
        this(context, bVar, str, dVar, bbVar, atVar, i, i2, aVar, new C23328d(context));
    }

    @ProguardMustNotDelete
    public C23334d getRequestProducers() {
        SettableFuture settableFuture = new SettableFuture();
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a |= 1;
        byVar.f181163b = BuildConfig.FLAVOR;
        bxVar.copyOnWrite();
        C66599by byVar2 = (C66599by) bxVar.instance;
        byVar2.f181162a |= 4;
        byVar2.f181167f = "Android";
        String str = Build.DISPLAY;
        bxVar.copyOnWrite();
        C66599by byVar3 = (C66599by) bxVar.instance;
        str.getClass();
        byVar3.f181162a |= 8;
        byVar3.f181168g = str;
        String str2 = this.f63847g;
        bxVar.copyOnWrite();
        C66599by byVar4 = (C66599by) bxVar.instance;
        str2.getClass();
        byVar4.f181162a |= 16;
        byVar4.f181169h = str2;
        String str3 = Build.MODEL;
        bxVar.copyOnWrite();
        C66599by byVar5 = (C66599by) bxVar.instance;
        str3.getClass();
        byVar5.f181162a |= 64;
        byVar5.f181171j = str3;
        String str4 = this.f63848h;
        if (str4 != null) {
            bxVar.copyOnWrite();
            C66599by byVar6 = (C66599by) bxVar.instance;
            byVar6.f181162a |= 32;
            byVar6.f181170i = str4;
        }
        DisplayMetrics displayMetrics = this.f63842a.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            bxVar.copyOnWrite();
            C66599by byVar7 = (C66599by) bxVar.instance;
            byVar7.f181162a |= 128;
            byVar7.f181172k = i;
            int i2 = displayMetrics.heightPixels;
            bxVar.copyOnWrite();
            C66599by byVar8 = (C66599by) bxVar.instance;
            byVar8.f181162a |= 256;
            byVar8.f181173l = i2;
            int i3 = displayMetrics.densityDpi;
            bxVar.copyOnWrite();
            C66599by byVar9 = (C66599by) bxVar.instance;
            byVar9.f181162a |= 512;
            byVar9.f181174m = i3;
        }
        settableFuture.mo57356n((C66599by) bxVar.build());
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        C67451at atVar = this.f63844c;
        kVar.copyOnWrite();
        C66678l lVar = (C66678l) kVar.instance;
        lVar.f181389b = atVar.f183321p;
        lVar.f181388a |= 1;
        int i4 = this.f63845d;
        kVar.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) i4;
        int bitCount = Integer.bitCount(this.f63849i);
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = bitCount;
        C66678l lVar4 = (C66678l) kVar.build();
        UUID.randomUUID().toString();
        new MutatableS3HeaderProducer();
        C58976aa aaVar = C58975e.f156826a;
        try {
            throw null;
        } catch (IOException unused) {
            throw null;
        }
    }

    @ProguardMustNotDelete
    public AudioS3RequestProducerFactory(Context context, C23332b bVar, String str, C92434d dVar, C90758bb bbVar, C67451at atVar, int i, int i2, C90476a aVar, C23327c cVar) {
        String str2;
        this.f63842a = context;
        String packageName = context.getPackageName();
        this.f63847g = packageName;
        try {
            str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x d = f63841f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AudioS3ReqProdFactory");
            ((C59052c) ((C59052c) d).mo56372aa(48631)).mo56389s("Could not get application version for %s", this.f63847g);
            str2 = null;
        }
        this.f63848h = str2;
        this.f63843b = new C23326b();
        this.f63844c = atVar;
        this.f63845d = i2;
        this.f63849i = i;
        this.f63846e = cVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.apps.gsa.shared.util.ProguardMustNotDelete
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioS3RequestProducerFactory(android.content.Context r13, com.google.android.libraries.gsa.p1934s3.producers.C23332b r14, java.lang.String r15, com.google.android.apps.gsa.speech.p7294j.C92434d r16, com.google.android.apps.gsa.shared.util.C90758bb r17, com.google.speech.recognizer.p5233a.C67451at r18, com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a r19) {
        /*
            r12 = this;
            com.google.speech.recognizer.a.at r0 = com.google.speech.recognizer.p5233a.C67451at.LINEAR16
            int r0 = r18.ordinal()
            r1 = 16000(0x3e80, float:2.2421E-41)
            if (r0 == 0) goto L_0x0030
            r2 = 3
            if (r0 == r2) goto L_0x002a
            r2 = 9
            if (r0 == r2) goto L_0x002a
            r2 = 10
            if (r0 != r2) goto L_0x0016
            goto L_0x0030
        L_0x0016:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = r18.name()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unsupported encoding: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002a:
            int r1 = com.google.android.libraries.p590as.p591a.C10771e.m25764a(r18)
            r10 = r1
            goto L_0x0032
        L_0x0030:
            r10 = 16000(0x3e80, float:2.2421E-41)
        L_0x0032:
            r9 = 16
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r11 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1934s3.lib.AudioS3RequestProducerFactory.<init>(android.content.Context, com.google.android.libraries.gsa.s3.producers.b, java.lang.String, com.google.android.apps.gsa.speech.j.d, com.google.android.apps.gsa.shared.util.bb, com.google.speech.recognizer.a.at, com.google.android.apps.gsa.shared.s.a.a):void");
    }
}
