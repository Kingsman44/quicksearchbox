package com.google.android.apps.gsa.speech.p7295k.p7297b;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.speech.k.b.e */
/* compiled from: PG */
public final class C92448e extends C90880an {

    /* renamed from: a */
    private final C89994f f257844a;

    /* renamed from: b */
    private final String f257845b;

    /* renamed from: c */
    private final String f257846c;

    /* renamed from: d */
    private final amo f257847d;

    /* renamed from: e */
    private final String f257848e;

    /* renamed from: f */
    private final String f257849f;

    /* renamed from: g */
    private final C92461a f257850g;

    public C92448e(C89994f fVar, String str, C92461a aVar, String str2, amo amo, String str3, String str4) {
        super("S3ClientInfoBuilderTask", 1, 0);
        this.f257844a = fVar;
        this.f257845b = str;
        this.f257850g = aVar;
        this.f257846c = str2;
        this.f257847d = amo;
        this.f257848e = str3;
        this.f257849f = str4;
    }

    /* renamed from: b */
    public final C66599by call() {
        DisplayMetrics displayMetrics;
        String str = Build.MODEL;
        String str2 = this.f257848e;
        if (str2 != null) {
            str = String.valueOf(str).concat(str2);
        }
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a |= 1;
        String str3 = BuildConfig.FLAVOR;
        byVar.f181163b = str3;
        bxVar.copyOnWrite();
        C66599by byVar2 = (C66599by) bxVar.instance;
        byVar2.f181162a |= 4;
        byVar2.f181167f = "Android";
        String str4 = Build.DISPLAY;
        bxVar.copyOnWrite();
        C66599by byVar3 = (C66599by) bxVar.instance;
        str4.getClass();
        byVar3.f181162a |= 8;
        byVar3.f181168g = str4;
        String str5 = this.f257845b;
        bxVar.copyOnWrite();
        C66599by byVar4 = (C66599by) bxVar.instance;
        str5.getClass();
        byVar4.f181162a |= 16;
        byVar4.f181169h = str5;
        String str6 = this.f257850g.f257900a;
        bxVar.copyOnWrite();
        C66599by byVar5 = (C66599by) bxVar.instance;
        str6.getClass();
        byVar5.f181162a |= 32;
        byVar5.f181170i = str6;
        String str7 = (String) this.f257850g.f257902c.mo6453a();
        bxVar.copyOnWrite();
        C66599by byVar6 = (C66599by) bxVar.instance;
        str7.getClass();
        byVar6.f181162a |= 2;
        byVar6.f181164c = str7;
        bxVar.copyOnWrite();
        C66599by byVar7 = (C66599by) bxVar.instance;
        str.getClass();
        byVar7.f181162a |= 64;
        byVar7.f181171j = str;
        amo amo = this.f257847d;
        if (amo != null) {
            str3 = amo.name();
        }
        bxVar.copyOnWrite();
        C66599by byVar8 = (C66599by) bxVar.instance;
        str3.getClass();
        byVar8.f181162a |= 4096;
        byVar8.f181176o = str3;
        ArrayList b = C58597ky.m90211b(this.f257844a.mo83891ak());
        DisplayManager displayManager = (DisplayManager) this.f257850g.f257901b.getSystemService("display");
        if (displayManager == null) {
            displayMetrics = null;
        } else {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayManager.getDisplay(0).getMetrics(displayMetrics2);
            displayMetrics = displayMetrics2;
        }
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            bxVar.copyOnWrite();
            C66599by byVar9 = (C66599by) bxVar.instance;
            byVar9.f181162a |= 128;
            byVar9.f181172k = i;
            int i2 = displayMetrics.heightPixels;
            bxVar.copyOnWrite();
            C66599by byVar10 = (C66599by) bxVar.instance;
            byVar10.f181162a |= 256;
            byVar10.f181173l = i2;
            int i3 = displayMetrics.densityDpi;
            bxVar.copyOnWrite();
            C66599by byVar11 = (C66599by) bxVar.instance;
            byVar11.f181162a |= 512;
            byVar11.f181174m = i3;
        }
        String str8 = this.f257846c;
        if (str8 != null) {
            bxVar.copyOnWrite();
            C66599by byVar12 = (C66599by) bxVar.instance;
            byVar12.f181162a |= 2048;
            byVar12.f181175n = str8;
        }
        bxVar.mo59682a(b);
        C58976aa aaVar = C58975e.f156826a;
        C58528ij X = this.f257844a.mo83861X(str3);
        if (X != null) {
            bxVar.mo59683b(X);
        }
        String str9 = this.f257849f;
        if (str9 != null && !str9.isEmpty()) {
            String str10 = this.f257849f;
            bxVar.copyOnWrite();
            C66599by byVar13 = (C66599by) bxVar.instance;
            str10.getClass();
            byVar13.mo59684a();
            byVar13.f181166e.add(str10);
        }
        return (C66599by) bxVar.build();
    }
}
