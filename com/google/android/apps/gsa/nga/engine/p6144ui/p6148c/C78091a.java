package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.a */
/* compiled from: PG */
public final class C78091a extends BaseAdapter {

    /* renamed from: a */
    public final List f215076a = new ArrayList();

    /* renamed from: b */
    private final Context f215077b;

    public C78091a(Context context) {
        this.f215077b = context;
    }

    public final int getCount() {
        return this.f215076a.size();
    }

    public final Object getItem(int i) {
        return this.f215076a.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((CharSequence) this.f215076a.get(i)).hashCode();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0012
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r1.f215077b
            r3.<init>(r4)
            java.lang.String r4 = "#CCCCCC"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
        L_0x0012:
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.List r0 = r1.f215076a
            java.lang.Object r2 = r0.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4.setText(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6148c.C78091a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
