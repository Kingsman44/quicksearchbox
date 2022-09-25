package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.kids.parentaccess.ParentAccessToken;
import com.google.android.gms.kids.parentaccess.ParentVerificationResponse;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.assistant.p3861at.C50377uv;
import com.google.assistant.p3861at.C50378uw;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.z */
/* compiled from: PG */
final class C102126z implements C0815b {

    /* renamed from: a */
    final /* synthetic */ C102123y f284911a;

    public C102126z(C102123y yVar) {
        this.f284911a = yVar;
    }

    public final /* synthetic */ void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        if (activityResult.f2755a == -1) {
            Intent intent = activityResult.f2756b;
            if (intent != null) {
                ParentVerificationResponse parentVerificationResponse = (ParentVerificationResponse) C143948d.m234109b(intent, "com.google.android.gms.kids.PARENT_VERIFICATION_RESPONSE", ParentVerificationResponse.CREATOR);
                parentVerificationResponse.getClass();
                if (parentVerificationResponse.f391040a != null) {
                    acw acw = (acw) acx.f128971H.createBuilder();
                    C50377uv uvVar = (C50377uv) C50378uw.f131140c.createBuilder();
                    ParentAccessToken parentAccessToken = parentVerificationResponse.f391040a;
                    parentAccessToken.getClass();
                    String str = parentAccessToken.f391038a;
                    uvVar.copyOnWrite();
                    C50378uw uwVar = (C50378uw) uvVar.instance;
                    str.getClass();
                    uwVar.f131142a |= 8;
                    uwVar.f131143b = str;
                    C50378uw uwVar2 = (C50378uw) uvVar.build();
                    acw.copyOnWrite();
                    acx acx = (acx) acw.instance;
                    uwVar2.getClass();
                    acx.f128974B = uwVar2;
                    acx.f128985b |= 4096;
                    t b = C73894n.m108499b();
                    C102123y yVar = this.f284911a;
                    t tVar = b;
                    tVar.c = C58833ax.m90833j(yVar.f284901h.mo79689w(yVar.f284907n));
                    b.c((acx) acw.build());
                    tVar.j = C58833ax.m90834k(getClass().getSimpleName());
                    C60870cx c = this.f284911a.f284896c.c(b, C102123y.f284895b.getSeconds(), TimeUnit.SECONDS);
                    C102123y yVar2 = this.f284911a;
                    yVar2.f284903j.mo50428h(C46438d.m82809a(c).f121541a, (Object) null, yVar2.f284904k);
                    return;
                }
                return;
            }
            return;
        }
        C59104x b2 = C102123y.f284894a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ParentReuathPermissionFrag");
        ((C59052c) ((C59052c) b2).mo56372aa(20541)).mo56352E("%s:%d", this.f284911a.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_error_message), activityResult.f2755a);
    }
}
