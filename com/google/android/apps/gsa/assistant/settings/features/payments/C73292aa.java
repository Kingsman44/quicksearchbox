package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50411wb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.aa */
/* compiled from: PG */
final class C73292aa implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ab f194171a;

    /* renamed from: b */
    private C58833ax f194172b = C58836b.f156633a;

    /* renamed from: c */
    private final C50411wb f194173c;

    public C73292aa(ab abVar, C50411wb wbVar) {
        this.f194171a = abVar;
        this.f194173c = wbVar;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.aa.onClick(android.view.View):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onClick(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.aa.onClick(android.view.View):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.payments.C73292aa.onClick(android.view.View):void");
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!menuItem.isEnabled() || menuItem.getItemId() != R.id.assistant_settings_payments_instrument_menu_edit) {
            return false;
        }
        this.f194171a.e.mo64830c(this.f194173c);
        return true;
    }
}
