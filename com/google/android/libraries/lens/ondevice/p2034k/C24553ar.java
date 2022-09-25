package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4701g.C62356s;
import com.google.lens.p4701g.C62357t;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ar */
/* compiled from: PG */
public final class C24553ar {

    /* renamed from: b */
    private static final C58974d f67234b = C58974d.m91135i("NativeOcrEngineHelper");

    /* renamed from: a */
    public C58833ax f67235a = C58836b.f156633a;

    /* renamed from: c */
    private final OnDeviceEngineNativeApi f67236c;

    public C24553ar(OnDeviceEngineNativeApi onDeviceEngineNativeApi) {
        this.f67236c = onDeviceEngineNativeApi;
    }

    /* renamed from: c */
    public static final String m45635c(C24814y yVar) {
        String str = yVar.f67829b;
        return "ocr_multiscript_tflite";
    }

    /* renamed from: a */
    public final synchronized C62355r mo29953a(C62353p pVar, Bitmap bitmap) {
        C58838bb.m90884s(this.f67236c.mo30010a() != 0, "Native OCR instance has not been initialized or has been teardown!");
        return this.f67236c.mo30012c(pVar, bitmap);
    }

    /* renamed from: b */
    public final boolean mo29954b(String str) {
        if (str.isEmpty() || this.f67235a.equals(C58833ax.m90834k("ocr_multiscript_tflite"))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final synchronized void mo29955d(Context context, C24814y yVar, C24803n nVar) {
        String str;
        String str2 = yVar.f67829b;
        if (this.f67236c.mo30010a() != 0) {
            if (this.f67235a.equals(C58833ax.m90834k("ocr_multiscript_tflite"))) {
                ((C58970a) ((C58970a) f67234b.mo56226d()).mo56372aa(48842)).mo56386p("Native API instance was already initialized with the same model.");
                return;
            }
        }
        String f = C24473a.m45547f(nVar, "ocr_multiscript_tflite");
        if (!TextUtils.isEmpty(f)) {
            C58833ax a = C24568bf.m45659a();
            if (!a.mo56113h()) {
                a = C24568bf.m45659a();
                C58838bb.m90883r(a.mo56113h());
                str = "ocr_multiscript_tflite";
            } else {
                str = "ocr_multiscript_tflite";
            }
            ((C58970a) ((C58970a) f67234b.mo56224b()).mo56372aa(48841)).mo56354G("Loading OCR model: %s %s", "ocr_multiscript_tflite", f);
            OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67236c;
            C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
            C62356s sVar = (C62356s) C62357t.f168340e.createBuilder();
            String str3 = (String) a.mo56107c();
            sVar.copyOnWrite();
            C62357t tVar = (C62357t) sVar.instance;
            str3.getClass();
            tVar.f168342a |= 1;
            tVar.f168343b = str3;
            sVar.copyOnWrite();
            C62357t tVar2 = (C62357t) sVar.instance;
            f.getClass();
            tVar2.f168342a |= 2;
            tVar2.f168344c = f;
            sVar.copyOnWrite();
            C62357t tVar3 = (C62357t) sVar.instance;
            tVar3.f168342a |= 4;
            tVar3.f168345d = 4;
            mVar.copyOnWrite();
            C62351n nVar2 = (C62351n) mVar.instance;
            C62357t tVar4 = (C62357t) sVar.build();
            tVar4.getClass();
            nVar2.f168324b = tVar4;
            nVar2.f168323a = 1;
            onDeviceEngineNativeApi.mo30015f(context, (C62351n) mVar.build());
            this.f67235a = C58833ax.m90834k(str);
            return;
        }
        throw new C24272d("ocr_multiscript_tflite");
    }
}
