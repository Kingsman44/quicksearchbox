package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.b */
/* compiled from: PG */
public class C88508b extends FrameLayout implements C88509c {

    /* renamed from: c */
    private static final C59071e f239231c = C59071e.m91332i("com.google.android.apps.gsa.search.shared.ui.actions.b");

    /* renamed from: a */
    public C88507a f239232a;

    /* renamed from: b */
    public final String f239233b;

    public C88508b(Context context, String str) {
        super(context);
        this.f239233b = str;
    }

    /* renamed from: b */
    public List mo82064b() {
        return new ArrayList();
    }

    /* renamed from: e */
    public void mo82065e() {
    }

    /* renamed from: f */
    public void mo82066f(String str, String str2) {
    }

    /* renamed from: g */
    public void mo82067g(C88507a aVar) {
        this.f239232a = aVar;
        if (getWindowToken() != null) {
            C59052c cVar = (C59052c) f239231c.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, this.f239233b);
            ((C59052c) cVar.mo56372aa(9785)).mo56386p("#handleAttach - setController");
            mo82070ij();
        }
    }

    /* renamed from: h */
    public boolean mo82068h(Runnable runnable) {
        return false;
    }

    /* renamed from: id */
    public final void mo82069id() {
        C88507a aVar = this.f239232a;
        if (aVar != null) {
            aVar.mo82058u();
            aVar.f239227c = null;
        }
    }

    /* renamed from: ij */
    public void mo82070ij() {
        C88507a aVar = this.f239232a;
        if (aVar != null) {
            aVar.mo82044g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            C88507a aVar = this.f239232a;
            aVar.getClass();
            aVar.mo82058u();
        }
    }
}
