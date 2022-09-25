package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30727ay;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

@Deprecated
/* compiled from: PG */
public class EmbeddedAccountMenu extends C30727ay {

    /* renamed from: i */
    private C63644b f81899i;

    public EmbeddedAccountMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C63644b mo35801a() {
        return this.f81899i;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int id = view.getId();
        if (id == R.id.scroll_view || id == R.id.selected_account_header || id == R.id.selected_account_header_shadow) {
            super.addView(view, i, layoutParams);
        } else {
            this.f82946g.addView(view, i, layoutParams);
        }
    }

    public EmbeddedAccountMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountMenuStyle);
    }

    public EmbeddedAccountMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 6;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 10;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a |= 8;
        this.f81899i = (C63644b) aVar.build();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30642g.f82730a, i, 2132149621);
        try {
            setBackgroundColor(obtainStyledAttributes.getColor(4, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
