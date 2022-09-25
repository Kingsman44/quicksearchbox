package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.widget.C0673gh;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.k */
/* compiled from: PG */
public final class C110381k extends C0673gh implements C91096f {

    /* renamed from: l */
    private static final C59071e f307631l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.k");

    /* renamed from: a */
    public final C68214a f307632a;

    /* renamed from: b */
    public final C68214a f307633b;

    /* renamed from: c */
    public final C68214a f307634c;

    /* renamed from: d */
    public final C91090a f307635d;

    /* renamed from: e */
    public final ImageView[] f307636e;

    /* renamed from: f */
    public final ImageView f307637f;

    /* renamed from: g */
    public final TextView f307638g;

    /* renamed from: h */
    public final TextView f307639h;

    /* renamed from: i */
    public final CheckBox f307640i;

    /* renamed from: j */
    public final int f307641j;

    /* renamed from: k */
    public final C110370cb f307642k;

    /* renamed from: m */
    private final C110340az f307643m;

    public C110381k(int i, ViewGroup viewGroup, C110370cb cbVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C91090a aVar4, C110340az azVar) {
        super(viewGroup);
        this.f307641j = i;
        this.f307642k = cbVar;
        this.f307632a = aVar;
        this.f307633b = aVar2;
        this.f307634c = aVar3;
        this.f307635d = aVar4;
        this.f307643m = azVar;
        this.f307636e = new ImageView[]{(ImageView) viewGroup.findViewById(R.id.album_preview_1), (ImageView) viewGroup.findViewById(R.id.album_preview_2), (ImageView) viewGroup.findViewById(R.id.album_preview_3)};
        this.f307637f = (ImageView) viewGroup.findViewById(R.id.album_thumbnail);
        this.f307638g = (TextView) viewGroup.findViewById(R.id.album_title);
        this.f307639h = (TextView) viewGroup.findViewById(R.id.album_secondary);
        this.f307640i = (CheckBox) viewGroup.findViewById(R.id.checkbox_select_album);
    }

    /* renamed from: b */
    public static String m183785b(Context context, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getQuantityString(R.plurals.album_photo_count_subtitle, i, new Object[]{Integer.valueOf(i)}));
        if (z) {
            sb.append(" • ");
            sb.append(context.getString(R.string.album_shared_subtitle));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo98610c(ImageView imageView, String str) {
        imageView.setVisibility(0);
        C91193ay q = C91196ba.m149039q();
        C91222n nVar = (C91222n) q;
        nVar.f254620a = str;
        nVar.f254621b = new Size(imageView.getWidth(), imageView.getHeight());
        nVar.f254622c = Integer.valueOf(R.color.google_grey100);
        ((C91189au) this.f307632a.mo27525b()).mo85420h(q.mo85445c(), imageView);
    }

    /* renamed from: d */
    public final void mo98611d(ImageView imageView) {
        imageView.setVisibility(0);
        imageView.setImageDrawable(new ColorDrawable(imageView.getContext().getResources().getColor(R.color.google_grey100)));
    }

    /* renamed from: e */
    public final void mo98612e(int i) {
        C91115n.m148873e((ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams(), 0, 0, 0, i);
    }

    /* renamed from: f */
    public final void mo98613f(String str, boolean z) {
        this.f307639h.setText(str);
        this.f307639h.setSingleLine(z);
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        String str;
        if (intent != null) {
            str = intent.getStringExtra("album_media_key");
        } else {
            str = null;
        }
        int i2 = -1;
        if (i == -1) {
            if (str != null) {
                this.f307643m.mo98580b(this.f307642k, C58833ax.m90834k(str));
            }
        } else if (i == 0) {
            if (intent != null) {
                i2 = intent.getIntExtra("error_code", 0);
            }
            C59104x b = f307631l.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AlbumDVH");
            ((C59052c) ((C59052c) b).mo56372aa(25812)).mo56387q("or ec %d", i2);
            String F = ((C86054o) this.f307633b.mo27525b()).mo79659F();
            if (!(i2 == 2 || F == null)) {
                Resources resources = this.itemView.getContext().getResources();
                new AlertDialog.Builder(this.itemView.getContext()).setTitle(R.string.album_create_error_title).setMessage(resources.getString(R.string.album_create_error_message, new Object[]{F})).setPositiveButton(R.string.album_create_error_confirm, C110377g.f307626a).create().show();
            }
        }
        return true;
    }
}
