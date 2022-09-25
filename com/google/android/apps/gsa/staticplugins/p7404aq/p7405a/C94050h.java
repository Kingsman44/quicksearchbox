package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import android.database.Cursor;
import com.google.android.apps.gsa.shared.util.C91087s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.h */
/* compiled from: PG */
final class C94050h implements C91087s {

    /* renamed from: a */
    public final List f262704a = new ArrayList();

    /* renamed from: b */
    private final long f262705b = System.currentTimeMillis();

    /* renamed from: a */
    public final void mo70787a(Cursor cursor) {
        String string = cursor.getString(0);
        C59071e eVar = C94051i.f262706a;
        if (string != null) {
            this.f262704a.add(new C94049g(string, cursor.getInt(1), this.f262705b - cursor.getLong(2)));
        } else {
            ((C59052c) ((C59052c) C94051i.f262706a.mo56226d()).mo56372aa(19462)).mo56386p("Provider returned null display name.");
        }
    }
}
