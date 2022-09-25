package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;

/* compiled from: PG */
public class ContactDetailSelectItem extends LinearLayout {

    /* renamed from: a */
    public Contact f260742a;

    public ContactDetailSelectItem(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo87717a(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo87718b(int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(i);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public ContactDetailSelectItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactDetailSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89941l.m146512c(this, 6734);
    }
}
