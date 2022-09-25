package com.google.android.libraries.gsa.monet.tools.childstub.p1916ui;

import android.view.View;
import android.view.ViewStub;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23214k;

/* renamed from: com.google.android.libraries.gsa.monet.tools.childstub.ui.a */
/* compiled from: PG */
public class C23243a implements C23214k {

    /* renamed from: a */
    private final int f63710a;

    /* renamed from: b */
    private final View f63711b;

    /* renamed from: c */
    private ChildStub f63712c;

    public C23243a(int i, View view) {
        this.f63710a = i;
        this.f63711b = view;
    }

    public C23243a(ChildStub childStub) {
        this.f63710a = 0;
        this.f63711b = null;
        this.f63712c = childStub;
    }

    /* renamed from: a */
    public void mo28675a(C22939d dVar) {
        View il = dVar.mo28297il();
        il.getClass();
        if (this.f63712c == null) {
            View view = this.f63711b;
            view.getClass();
            View findViewById = view.findViewById(this.f63710a);
            C23067b.m43236i(findViewById, "Could not find the ChildStub in the layout.");
            if (findViewById instanceof ChildStub) {
                this.f63712c = (ChildStub) findViewById;
            } else if (findViewById instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) findViewById;
                viewStub.setLayoutResource(R.layout.monet_child_stub);
                View inflate = viewStub.inflate();
                inflate.getClass();
                ChildStub childStub = (ChildStub) inflate;
                this.f63712c = childStub;
                childStub.setId(viewStub.getId());
            } else {
                throw new IllegalStateException("Child stub is not of type ViewStub or ChildStub.");
            }
        }
        this.f63712c.mo28718c(il);
    }

    /* renamed from: b */
    public void mo28676b(C22939d dVar) {
        ChildStub childStub = this.f63712c;
        if (childStub != null) {
            childStub.mo28717b();
            return;
        }
        throw new IllegalStateException("childStub was null.");
    }
}
