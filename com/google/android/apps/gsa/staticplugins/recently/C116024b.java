package com.google.android.apps.gsa.staticplugins.recently;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6989am.C89194a;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98635r;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22843n;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.b */
/* compiled from: PG */
public final /* synthetic */ class C116024b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116093h f321711a;

    /* renamed from: b */
    public final /* synthetic */ String f321712b;

    /* renamed from: c */
    public final /* synthetic */ String f321713c;

    /* renamed from: d */
    public final /* synthetic */ String f321714d;

    /* renamed from: e */
    public final /* synthetic */ int f321715e;

    /* renamed from: f */
    public final /* synthetic */ C98635r f321716f;

    public /* synthetic */ C116024b(C116093h hVar, C98635r rVar, String str, String str2, String str3, int i) {
        this.f321711a = hVar;
        this.f321716f = rVar;
        this.f321712b = str;
        this.f321713c = str2;
        this.f321714d = str3;
        this.f321715e = i;
    }

    public final void run() {
        Bitmap bitmap;
        C116093h hVar = this.f321711a;
        C98635r rVar = this.f321716f;
        String str = this.f321712b;
        String str2 = this.f321713c;
        String str3 = this.f321714d;
        int i = this.f321715e;
        Uri a = rVar.mo91236a();
        if (a != null) {
            try {
                bitmap = C23335a.m43764a(hVar.f321900j, a);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C116093h.f321893a.mo56225c()).mo56382g(e)).mo56372aa(30881)).mo56386p("Exception: Failed to get screenshot bitmap.");
                bitmap = null;
            }
        } else {
            bitmap = (Bitmap) rVar.f275487a.getParcelable("bitmapInfo");
        }
        if (bitmap != null) {
            int a2 = C89194a.m145064a(hVar.f321894b);
            bitmap = Bitmap.createScaledBitmap(bitmap, a2, (bitmap.getHeight() * a2) / bitmap.getWidth(), true);
        }
        Uri b = rVar.mo91237b();
        if (hVar.mo102479v()) {
            C58833ax a3 = hVar.f321901k.mo79421a(b.toString());
            if (a3.mo56113h()) {
                b = Uri.parse((String) a3.mo56107c());
            }
            String host = b.getHost();
            if (!TextUtils.isEmpty(host)) {
                String replaceFirst = host.replaceFirst("^www\\.", BuildConfig.FLAVOR);
                C22832c u = C116093h.m192483u(hVar.f321895c.mo26870b(), str);
                u.copyOnWrite();
                C22845p pVar = (C22845p) u.instance;
                C22845p pVar2 = C22845p.f62890o;
                pVar.f62894c = 1;
                pVar.f62892a |= 2;
                u.copyOnWrite();
                C22845p pVar3 = (C22845p) u.instance;
                pVar3.f62892a |= 256;
                pVar3.f62900i = i;
                C22843n nVar = (C22843n) C22844o.f62884e.createBuilder();
                String uri = b.toString();
                nVar.copyOnWrite();
                C22844o oVar = (C22844o) nVar.instance;
                uri.getClass();
                oVar.f62886a |= 1;
                oVar.f62887b = uri;
                nVar.copyOnWrite();
                C22844o oVar2 = (C22844o) nVar.instance;
                replaceFirst.getClass();
                oVar2.f62886a |= 2;
                oVar2.f62888c = replaceFirst;
                int i2 = 4;
                if (str2 != null) {
                    nVar.copyOnWrite();
                    C22844o oVar3 = (C22844o) nVar.instance;
                    oVar3.f62886a |= 4;
                    oVar3.f62889d = str2;
                }
                u.copyOnWrite();
                C22845p pVar4 = (C22845p) u.instance;
                C22844o oVar4 = (C22844o) nVar.build();
                oVar4.getClass();
                pVar4.f62897f = oVar4;
                pVar4.f62892a |= 32;
                if (true != TextUtils.isEmpty(str)) {
                    i2 = 3;
                }
                hVar.mo102480w(u, bitmap, i2, str3);
            }
        }
    }
}
