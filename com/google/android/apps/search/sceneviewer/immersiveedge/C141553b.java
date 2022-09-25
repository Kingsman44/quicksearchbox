package com.google.android.apps.search.sceneviewer.immersiveedge;

import android.app.AlertDialog;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.FragmentManager;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.search.sceneviewer.C141568k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.b */
/* compiled from: PG */
public final class C141553b extends C0260w {

    /* renamed from: a */
    public static final String f384213a = "b";

    /* renamed from: b */
    private String f384214b;

    /* renamed from: c */
    private String f384215c;

    /* renamed from: a */
    public static void m229767a(FragmentManager fragmentManager, C141568k kVar) {
        if (kVar != null) {
            C141553b bVar = new C141553b();
            Bundle bundle = new Bundle();
            bundle.putString("link_url_bundle_id", kVar.f384245b);
            bundle.putString("link_display_bundle_id", kVar.f384246c);
            bVar.setArguments(bundle);
            bVar.showNow(fragmentManager, f384213a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f384214b = getArguments().getString("link_url_bundle_id");
        this.f384215c = getArguments().getString("link_display_bundle_id");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        Uri parse = Uri.parse(this.f384214b);
        if (TextUtils.isEmpty(this.f384215c)) {
            str = parse.getHost();
        } else {
            str = this.f384215c;
        }
        builder.setTitle(R.string.sceneviewer_immersive_edge_fallback_dialog_title).setMessage(Html.fromHtml(getContext().getResources().getString(R.string.sceneviewer_immersive_edge_fallback_dialog_message, new Object[]{str}))).setPositiveButton(R.string.sceneviewer_immersive_edge_fallback_dialog_confirm_button, new C141552a(this, parse));
        return builder.create();
    }
}
