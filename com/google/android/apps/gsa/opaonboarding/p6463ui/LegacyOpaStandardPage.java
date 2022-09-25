package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.StrictMode;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

@Deprecated
/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage */
/* compiled from: PG */
public class LegacyOpaStandardPage extends FrameLayout {

    /* renamed from: a */
    public final OpaPageLayout f228722a;

    /* renamed from: b */
    public final HeaderLayout f228723b;

    /* renamed from: c */
    public final C84031z f228724c;

    /* renamed from: d */
    public final FooterLayout f228725d;

    public LegacyOpaStandardPage(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo77366a() {
        this.f228724c.mo77494d(3, true);
    }

    /* renamed from: b */
    public final void mo77367b() {
        this.f228724c.mo77494d(6, true);
    }

    public LegacyOpaStandardPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C83976aa.f228768b, 0, 0);
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().permitNetwork().build());
        View.inflate(getContext(), R.layout.legacy_opa_standard_page, this);
        StrictMode.setThreadPolicy(threadPolicy);
        OpaPageLayout opaPageLayout = (OpaPageLayout) findViewById(R.id.opa_page_layout);
        this.f228722a = opaPageLayout;
        HeaderLayout headerLayout = new HeaderLayout(context);
        this.f228723b = headerLayout;
        C84031z zVar = new C84031z(context);
        this.f228724c = zVar;
        FooterLayout footerLayout = opaPageLayout.f228726a;
        this.f228725d = footerLayout;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.legacy_opa_standard_page_content, (ViewGroup) null);
        linearLayout.addView(headerLayout);
        linearLayout.addView(zVar, new LinearLayout.LayoutParams(-1, -1));
        opaPageLayout.mo77371c(linearLayout);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(obtainStyledAttributes.getResourceId(10, 0), headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(obtainStyledAttributes.getResourceId(9, 0), headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(zVar.f228878a, C84018m.m133906a(obtainStyledAttributes.getResourceId(8, 0), zVar), TextView.BufferType.NORMAL, zVar);
        C84018m.m133908c(zVar.f228879b, C84018m.m133906a(obtainStyledAttributes.getResourceId(2, 0), zVar), TextView.BufferType.NORMAL, zVar);
        zVar.mo77491a(obtainStyledAttributes.getDrawable(5), C84018m.m133906a(obtainStyledAttributes.getResourceId(6, 0), this));
        String string = obtainStyledAttributes.getString(17);
        if (string != null) {
            zVar.f228887j.setOnPreparedListener(new C84029x(zVar));
            zVar.f228887j.setVideoPath(string);
            zVar.f228887j.setZOrderOnTop(true);
            zVar.f228887j.start();
        }
        zVar.mo77494d(4, string != null);
        zVar.mo77493c(obtainStyledAttributes.getResourceId(16, 0));
        zVar.f228881d.setImageDrawable(obtainStyledAttributes.getDrawable(15));
        zVar.f228880c.setChecked(obtainStyledAttributes.getBoolean(14, false));
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        C84018m.m133908c(zVar.f228883f, C84018m.m133906a(resourceId, zVar), TextView.BufferType.NORMAL, zVar);
        C84018m.m133911f(zVar.findViewById(R.id.opa_error_sub_switch_container), resourceId != 0);
        zVar.f228884g.setImageDrawable(obtainStyledAttributes.getDrawable(12));
        zVar.f228882e.setChecked(obtainStyledAttributes.getBoolean(14, false));
        zVar.mo77492b(obtainStyledAttributes.getResourceId(7, 0));
        C84018m.m133908c(zVar.f228886i, C84018m.m133906a(obtainStyledAttributes.getResourceId(1, 0), zVar), TextView.BufferType.NORMAL, zVar);
        zVar.f228886i.setMovementMethod(LinkMovementMethod.getInstance());
        footerLayout.mo77362c(obtainStyledAttributes.getInt(4, 0));
        C84018m.m133907b(footerLayout.mo77360a(), obtainStyledAttributes.getResourceId(0, 0), footerLayout);
        C84018m.m133907b(footerLayout.mo77361b(), obtainStyledAttributes.getResourceId(3, 0), footerLayout);
        obtainStyledAttributes.recycle();
    }
}
