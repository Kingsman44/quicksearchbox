package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.v */
/* compiled from: PG */
public final class C30313v {

    /* renamed from: a */
    public final CopyOnWriteArrayList f81975a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f81976b;

    /* renamed from: a */
    public final void mo35878a(boolean z) {
        if (this.f81976b != z) {
            this.f81976b = z;
            Iterator it = this.f81975a.iterator();
            while (it.hasNext()) {
                ((C30312u) it.next()).mo35877a(this.f81976b);
            }
        }
    }
}
