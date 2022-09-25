package com.google.android.libraries.assistant.slices;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import androidx.slice.SliceItem;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.slices.e */
/* compiled from: PG */
final class C19229e extends C19234j {

    /* renamed from: a */
    final /* synthetic */ EditText f53833a;

    /* renamed from: b */
    final /* synthetic */ String f53834b = "00h 00m 00s";

    /* renamed from: c */
    final /* synthetic */ SliceItem f53835c;

    /* renamed from: d */
    final /* synthetic */ C19230f f53836d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19229e(C19230f fVar, Context context, EditText editText, SliceItem sliceItem) {
        super(context);
        this.f53836d = fVar;
        this.f53833a = editText;
        this.f53835c = sliceItem;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f53833a.hasFocus()) {
            this.f53836d.mo24319r(this.f53833a);
            super.afterTextChanged(editable);
            String obj = editable.toString();
            if (!obj.isEmpty() && obj.length() == this.f53834b.length()) {
                try {
                    this.f53835c.mo8599g(this.f53836d.getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", Duration.parse(String.format("PT%sH%sM%sS", new Object[]{obj.substring(0, 2), obj.substring(4, 6), obj.substring(8, 10)})).toMillis()));
                } catch (PendingIntent.CanceledException e) {
                    ((C59052c) ((C59052c) ((C59052c) C19230f.f53837A.mo56225c()).mo56382g(e)).mo56372aa(47542)).mo56386p("PendingIntent for slice cannot be sent.");
                }
            }
        }
    }
}
