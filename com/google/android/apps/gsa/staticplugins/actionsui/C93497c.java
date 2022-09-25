package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import androidx.p176n.p177a.C3795f;
import androidx.p176n.p177a.C3797h;
import androidx.p176n.p177a.C3798i;
import androidx.p176n.p177a.C3799j;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.p7148ui.C90698j;
import com.google.android.apps.gsa.shared.util.C91068o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.c */
/* compiled from: PG */
public class C93497c extends AsyncTask {

    /* renamed from: a */
    private final Resources f260955a;

    /* renamed from: b */
    private final ImageView f260956b;

    /* renamed from: c */
    private final boolean f260957c;

    /* renamed from: d */
    private final boolean f260958d;

    /* renamed from: e */
    private final boolean f260959e;

    /* renamed from: f */
    private final boolean f260960f;

    /* renamed from: g */
    private int f260961g = 0;

    public C93497c(Resources resources, ImageView imageView, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f260955a = resources;
        imageView.getClass();
        this.f260956b = imageView;
        this.f260957c = z;
        this.f260958d = z2;
        this.f260959e = z3;
        this.f260960f = z4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87782a(int i) {
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i = 0;
        Person person = ((Person[]) objArr)[0];
        Bitmap a = C91068o.m148774a(C39239a.m68666a(this.f260956b.getContext(), C39226b.TAG_CLASSIC_ASSISTANT_LEGACY).getContentResolver(), person.f236371b);
        Resources resources = this.f260955a;
        String str = person.f236372c;
        if (C93448ao.f260825a == null) {
            C93448ao.f260825a = resources.obtainTypedArray(R.array.actionsui_letter_tile_colors);
            C93448ao.f260826b = resources.getInteger(R.integer.actionsui_letter_tile_colors_length);
            C93448ao.f260827c = resources.getColor(R.color.letter_tile_default_color);
        }
        this.f260961g = C93448ao.m153828a(str);
        if (this.f260959e && a != null) {
            C3795f fVar = new C3795f(a);
            fVar.f12234a = 16;
            C3798i a2 = fVar.mo8023a();
            C3797h b = a2.mo8031b(C3799j.f12254b);
            if (b == null && (b = a2.mo8031b(C3799j.f12255c)) == null) {
                b = a2.mo8031b(C3799j.f12258f);
            }
            if (b != null) {
                i = b.f12238a;
            }
            if (i != 0) {
                this.f260961g = i;
            }
        }
        if (a == null) {
            return new C93447an(this.f260955a, person.f236373d, this.f260961g, this.f260957c, this.f260960f);
        }
        if (this.f260957c) {
            return new C90698j(a);
        }
        return new BitmapDrawable(this.f260955a, a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            this.f260956b.setImageDrawable(drawable);
            this.f260956b.setVisibility(0);
        } else if (!this.f260958d) {
            this.f260956b.setVisibility(8);
        }
        if (this.f260959e && (i = this.f260961g) != 0) {
            mo87782a(i);
        }
    }
}
