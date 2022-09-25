package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11324l;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bg */
/* compiled from: PG */
final class C11374bg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C51030du f37109a;

    /* renamed from: b */
    final /* synthetic */ ListField f37110b;

    public C11374bg(ListField listField, C51030du duVar) {
        this.f37110b = listField;
        this.f37109a = duVar;
    }

    public final void onClick(View view) {
        C0167am amVar = this.f37110b.f37156o;
        if (amVar != null) {
            FragmentManager jw = amVar.mo545jw();
            Context context = this.f37110b.getContext();
            ListField listField = this.f37110b;
            C62971cq cqVar = this.f37109a.f132875f;
            C11324l lVar = new C11324l();
            lVar.f36796d = context;
            lVar.f36794b = listField;
            lVar.f36795c = cqVar;
            lVar.show(jw, "ListItemPicker");
        }
    }
}
