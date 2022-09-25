package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.a.h */
/* compiled from: PG */
public final class C101882h extends C0260w {

    /* renamed from: a */
    public Runnable f284172a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16973838);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.hotword_enrollment_exit_flow_unicorn_error_dialog_fragment, viewGroup, false);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        headerLayout.setVisibility(0);
        Bundle arguments = getArguments();
        Objects.requireNonNull(arguments, "Arguments are null!");
        String string = arguments.getString("unicorn_name", BuildConfig.FLAVOR);
        String string2 = arguments.getString("unicorn_gender", BuildConfig.FLAVOR);
        C84018m.m133908c(headerLayout.f228718a, C5114a.m13988b(Locale.getDefault(), getString(R.string.hotword_enrollment_google_home_skip_dialog_title), "PERSON", string), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C5114a.m13988b(Locale.getDefault(), getString(R.string.unicorn_hotword_enrollment_google_home_skip_dialog_message), "PERSON", string, "GENDER", string2), TextView.BufferType.NORMAL, headerLayout);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        Button a = footerLayout.mo77360a();
        a.setText(R.string.hotword_enrollment_google_home_skip_dialog_positive_button);
        a.setOnClickListener(new C101880f(this));
        Button b = footerLayout.mo77361b();
        b.setText(getString(R.string.hotword_enrollment_google_home_skip_dialog_negative_button));
        b.setOnClickListener(new C101881g(this));
        return opaPageLayout;
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && getActivity() != null) {
            Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = point.x;
            int i2 = point.y;
            int applyDimension = (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(i - applyDimension, i2 - (applyDimension + applyDimension));
            }
        }
    }
}
