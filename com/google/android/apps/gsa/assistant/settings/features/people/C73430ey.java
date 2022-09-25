package com.google.android.apps.gsa.assistant.settings.features.people;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.ey */
/* compiled from: PG */
public final class C73430ey extends LinearLayout {

    /* renamed from: a */
    public final FooterLayout f194418a;

    /* renamed from: b */
    public final RelativeLayout f194419b;

    public C73430ey(Context context) {
        super(context, (AttributeSet) null);
        View inflate = View.inflate(context, R.layout.speeddial_sendkit_layout, this);
        this.f194418a = (FooterLayout) inflate.findViewById(R.id.opa_footer_container);
        this.f194419b = (RelativeLayout) inflate.findViewById(R.id.speeddial_sendkit_layout);
    }
}
