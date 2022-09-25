package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50397vo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.g */
/* compiled from: PG */
final class C73334g implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ h f194238a;

    /* renamed from: b */
    private C58833ax f194239b = C58836b.f156633a;

    /* renamed from: c */
    private final C50397vo f194240c;

    public C73334g(h hVar, C50397vo voVar) {
        this.f194238a = hVar;
        this.f194240c = voVar;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.g.onClick(android.view.View):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onClick(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.g.onClick(android.view.View):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.payments.C73334g.onClick(android.view.View):void");
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!menuItem.isEnabled() || menuItem.getItemId() != R.id.assistant_settings_payments_address_menu_delete) {
            return false;
        }
        bo boVar = this.f194238a.d;
        C50397vo voVar = this.f194240c;
        bo boVar2 = boVar;
        if (!boVar2.M.mo56113h()) {
            return true;
        }
        ((b) boVar2.M.mo56107c()).b(voVar);
        return true;
    }
}
