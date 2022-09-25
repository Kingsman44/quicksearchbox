package com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.e.c */
/* compiled from: PG */
public final class C115870c extends C83907bm {

    /* renamed from: b */
    public SharedPreferences f321306b;

    /* renamed from: c */
    public PackageManager f321307c;

    /* renamed from: d */
    public C86124t f321308d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.media_selection, (ViewGroup) null);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.media_selection_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.media_selection_explanation, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(4);
        Button b = footerLayout.mo77361b();
        b.setText(R.string.media_selection_cancel_button);
        b.setOnClickListener(new C89943l(new C115867a(this)));
        ((TextView) opaPageLayout.findViewById(R.id.content_description)).setText(R.string.media_selection_content_description);
        List<ResolveInfo> queryIntentActivities = this.f321307c.queryIntentActivities(new Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH"), 65536);
        LinearLayout linearLayout = (LinearLayout) opaPageLayout.findViewById(R.id.content_layout);
        C58528ij F = C58528ij.m90006F(this.f321308d.mo79745c(C90014bt.f247058W));
        for (ResolveInfo next : queryIntentActivities) {
            if (!F.contains(next.activityInfo.packageName)) {
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.media_provider, (ViewGroup) null, false);
                ((ImageView) linearLayout2.findViewById(R.id.provider_icon)).setImageDrawable(next.loadIcon(this.f321307c));
                ((TextView) linearLayout2.findViewById(R.id.provider_title)).setText(next.loadLabel(this.f321307c));
                linearLayout2.setClickable(true);
                linearLayout2.setOnClickListener(new C115869b(this, next));
                linearLayout.addView(linearLayout2);
            }
        }
        return opaPageLayout;
    }
}
