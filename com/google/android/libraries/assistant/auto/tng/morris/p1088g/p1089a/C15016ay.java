package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.Rect;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.ay */
/* compiled from: PG */
final class C15016ay extends C0648fj {

    /* renamed from: a */
    final /* synthetic */ C15017az f44997a;

    /* renamed from: b */
    private final int f44998b;

    /* renamed from: c */
    private final int f44999c;

    /* renamed from: d */
    private final int f45000d;

    /* renamed from: e */
    private final int f45001e;

    /* renamed from: f */
    private final int f45002f;

    public C15016ay(C15017az azVar, ContextThemeWrapper contextThemeWrapper) {
        this.f44997a = azVar;
        this.f44998b = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_recycler_view_padding_horizontal);
        this.f44999c = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_top_margin);
        this.f45000d = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_bottom_margin);
        this.f45001e = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_start_margin);
        this.f45002f = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_end_margin);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, geVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        C0640fb fbVar = recyclerView.mAdapter;
        fbVar.getClass();
        int itemCount = fbVar.getItemCount();
        if (this.f44997a.f45009d.mo79746e(C90051dc.f248821ac)) {
            int i3 = itemCount - 1;
            if (!(childAdapterPosition == i3 && itemCount % 2 == 1)) {
                if (childAdapterPosition % 2 == 0) {
                    rect.right = this.f45002f;
                } else {
                    rect.left = this.f45001e;
                }
            }
            rect.top = this.f44999c;
            rect.bottom = this.f45000d;
            if (childAdapterPosition == i3 || (childAdapterPosition == itemCount - 2 && itemCount % 2 == 0)) {
                rect.bottom += this.f45000d;
                return;
            }
            return;
        }
        boolean z = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0;
        if (z) {
            i = this.f45001e;
        } else {
            i = this.f45002f;
        }
        rect.left = i;
        if (z) {
            i2 = this.f45002f;
        } else {
            i2 = this.f45001e;
        }
        rect.right = i2;
        rect.top = this.f44999c;
        rect.bottom = this.f45000d;
        if (childAdapterPosition <= 1) {
            if (z) {
                rect.left += this.f44998b;
            } else {
                rect.right += this.f44998b;
            }
        }
        C0640fb fbVar2 = recyclerView.mAdapter;
        fbVar2.getClass();
        if (fbVar2.getItemCount() % 2 == 0) {
            C0640fb fbVar3 = recyclerView.mAdapter;
            fbVar3.getClass();
            if (childAdapterPosition == fbVar3.getItemCount() - 2) {
                if (z) {
                    rect.right += this.f44998b;
                } else {
                    rect.left += this.f44998b;
                }
            }
        }
        C0640fb fbVar4 = recyclerView.mAdapter;
        fbVar4.getClass();
        if (childAdapterPosition != fbVar4.getItemCount() - 1) {
            return;
        }
        if (z) {
            rect.right += this.f44998b;
        } else {
            rect.left += this.f44998b;
        }
    }
}
