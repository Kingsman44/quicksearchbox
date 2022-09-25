package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.util.C113859cn;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.g */
/* compiled from: PG */
public final class C113628g {

    /* renamed from: a */
    static final C58495hd f314633a = C58495hd.m89903q(Integer.valueOf(R.string.interpreter_english), "en", Integer.valueOf(R.string.interpreter_french), "fr", Integer.valueOf(R.string.interpreter_german), "de", Integer.valueOf(R.string.interpreter_spanish), "es");

    /* renamed from: j */
    private static final C59071e f314634j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.offline.g");

    /* renamed from: b */
    public final C22871g f314635b;

    /* renamed from: c */
    public final C58833ax f314636c;

    /* renamed from: d */
    public final C68214a f314637d;

    /* renamed from: e */
    public final C68214a f314638e;

    /* renamed from: f */
    public final C68214a f314639f;

    /* renamed from: g */
    public final ArrayList f314640g = new ArrayList();

    /* renamed from: h */
    public C108230ba f314641h;

    /* renamed from: i */
    public C113859cn f314642i;

    public C113628g(C22871g gVar, C68214a aVar, C68214a aVar2, C58833ax axVar, C68214a aVar3) {
        this.f314635b = gVar;
        this.f314638e = aVar;
        this.f314639f = aVar2;
        this.f314636c = axVar;
        this.f314637d = aVar3;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public static void m188120a(String str, Throwable th) {
        C59104x c = f314634j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "InterpChatCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(28081)).mo56389s("Failed to run %s future info", str);
    }

    /* renamed from: b */
    public final void mo100357b() {
        if (this.f314641h != null && !this.f314640g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f314640g;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C58976aa aaVar = C58975e.f156826a;
                int intValue = ((Integer) arrayList2.get(i)).intValue();
                C108248bs bsVar = C108248bs.INTERPRETER;
                bsVar.f301130v = intValue;
                arrayList.add(((C108250bu) this.f314637d.mo27525b()).mo96700a(bsVar, new Object[0]));
            }
            this.f314641h.mo95373O(arrayList);
            this.f314640g.clear();
        }
    }
}
