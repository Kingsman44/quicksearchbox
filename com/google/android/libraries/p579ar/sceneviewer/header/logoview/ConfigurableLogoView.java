package com.google.android.libraries.p579ar.sceneviewer.header.logoview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.search.sceneviewer.C141570m;
import com.google.android.libraries.p11026am.C147759b;
import com.google.android.libraries.p579ar.sceneviewer.utilities.UriUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.WebUtilities;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.ar.sceneviewer.header.logoview.ConfigurableLogoView */
/* compiled from: PG */
public class ConfigurableLogoView extends ImageView {
    private static final C147759b LOGO_CONFIG_URL_CHECKER = C147759b.m240834b(C58485gu.m89846n("https://www.gstatic.com/ar/core/viewer/carousel/cloud9/logo_config/*"));
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.header.logoview.ConfigurableLogoView");

    public ConfigurableLogoView(Context context) {
        super(context);
    }

    public void configCustomLogo(C141570m mVar, String str) {
        if (!mVar.f384252d.isEmpty()) {
            Uri parse = Uri.parse(mVar.f384252d);
            Uri parse2 = Uri.parse(mVar.f384250b);
            if (!(parse2 == null || str == null)) {
                parse2 = UriUtilities.appendQueryParametersString(parse2, str);
            }
            String str2 = mVar.f384251c;
            if (LOGO_CONFIG_URL_CHECKER.mo124438c(parse)) {
                setOnClickListener(new ConfigurableLogoView$$ExternalSyntheticLambda0(this, str2, parse2));
                WebUtilities.downloadDrawable(getContext(), parse, false).thenAcceptAsync(new ConfigurableLogoView$$ExternalSyntheticLambda1(this), getContext().getMainExecutor());
            }
        }
    }

    /* renamed from: lambda$configCustomLogo$0$com-google-android-libraries-ar-sceneviewer-header-logoview-ConfigurableLogoView */
    public /* synthetic */ void mo18828x17aba274(Uri uri, DialogInterface dialogInterface, int i) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    /* renamed from: lambda$configCustomLogo$1$com-google-android-libraries-ar-sceneviewer-header-logoview-ConfigurableLogoView */
    public /* synthetic */ void mo18829x465d0c93(String str, Uri uri, View view) {
        new AlertDialog.Builder(getContext()).setMessage(Html.fromHtml(getContext().getResources().getString(C10702R.string.immersive_edge_logo_redirect_text, new Object[]{str}))).setPositiveButton(C10702R.string.immersive_edge_logo_redirect_confirm, new ConfigurableLogoView$$ExternalSyntheticLambda2(this, uri)).setNegativeButton(C10702R.string.immersive_edge_logo_redirect_cancel, (DialogInterface.OnClickListener) null).show();
    }

    /* renamed from: lambda$configCustomLogo$2$com-google-android-libraries-ar-sceneviewer-header-logoview-ConfigurableLogoView */
    public /* synthetic */ void mo18830x750e76b2(Drawable drawable) {
        if (drawable != null) {
            setImageDrawable(drawable);
        } else {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42326)).mo56386p("Failed to load image.");
        }
    }

    public ConfigurableLogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public ConfigurableLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public ConfigurableLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
