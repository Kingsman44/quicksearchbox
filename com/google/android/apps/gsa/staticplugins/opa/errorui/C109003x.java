package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.gms.googlehelp.C144291g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21592d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.x */
/* compiled from: PG */
final class C109003x extends ClickableSpan {

    /* renamed from: a */
    private final Context f303097a;

    /* renamed from: b */
    private final C109004y f303098b;

    public C109003x(Context context, C109004y yVar) {
        this.f303097a = context;
        this.f303098b = yVar;
    }

    public final void onClick(View view) {
        C109004y yVar = this.f303098b;
        if (yVar == null) {
            C59104x d = C109005z.f303104b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ContinuedConvFragment");
            ((C59052c) ((C59052c) d).mo56372aa(24361)).mo56386p("Learn More Help is None.");
        } else if (yVar.f303102d.isEmpty()) {
            C59104x d2 = C109005z.f303104b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ContinuedConvFragment");
            ((C59052c) ((C59052c) d2).mo56372aa(24363)).mo56386p("Context String is empty.");
        } else {
            C90476a aVar = C91018d.f254254a;
            try {
                C21592d dVar = new C21592d(yVar.f303102d);
                Uri uri = yVar.f303103e;
                if (uri != null) {
                    dVar.f59965a.f390767q = uri;
                }
                dVar.f59965a.f390753c = (Account) yVar.f303100b.mo77278a().mo56107c();
                dVar.mo27019a((C21573h) yVar.f303101c.mo17428b());
                Intent a = dVar.f59965a.mo119806a();
                a.addFlags(C89885b.S3REQUEST_VALUE);
                Activity activity = yVar.f303099a;
                activity.getClass();
                new C144291g(activity).mo119820c(a);
            } catch (IllegalStateException e) {
                C59104x c = C109005z.f303104b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ContinuedConvFragment");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24362)).mo56386p("Failed to launch Google help.");
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f303097a.getResources().getColor(R.color.quantum_googblue500));
    }
}
