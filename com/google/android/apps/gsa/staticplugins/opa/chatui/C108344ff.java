package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ff */
/* compiled from: PG */
public final class C108344ff extends C108430ik {

    /* renamed from: a */
    public final Intent f301379a;

    /* renamed from: b */
    public final Context f301380b;

    public C108344ff(Intent intent, Context context) {
        super(125508, context.getResources().getString(R.string.opa_more_things_to_try_suggestion_chip_title));
        this.f301380b = context;
        this.f301379a = intent;
    }

    /* renamed from: a */
    public final Drawable mo96804a() {
        return this.f301380b.getResources().getDrawable(R.drawable.white_assistant_logo);
    }
}
