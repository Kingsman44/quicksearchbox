package com.google.android.apps.gsa.staticplugins.collectpin.pinentry;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.collectpin.C98491e;
import com.google.android.apps.gsa.staticplugins.collectpin.CollectPinActivity;
import com.google.assistant.p3897e.p3921j.aof;
import com.google.assistant.p3897e.p3921j.aog;
import com.google.assistant.p3897e.p3921j.aoj;
import com.google.assistant.p3897e.p3921j.aom;
import com.google.assistant.p3897e.p3921j.aoq;
import com.google.common.base.C58911u;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.pinentry.b */
/* compiled from: PG */
public final class C98500b implements TextWatcher {

    /* renamed from: a */
    private final PinEntryView f275058a;

    /* renamed from: b */
    private final Object f275059b = new Object();

    /* renamed from: c */
    private boolean f275060c;

    /* renamed from: d */
    private String f275061d;

    public C98500b(PinEntryView pinEntryView) {
        this.f275058a = pinEntryView;
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.f275060c) {
            String q = C58911u.f156751b.mo56196q(this.f275061d);
            String q2 = C58911u.f156751b.mo56196q(editable);
            int length = q2.length();
            int spanEnd = editable.getSpanEnd(this.f275059b);
            this.f275060c = true;
            PinEntryView pinEntryView = this.f275058a;
            if (length > pinEntryView.f275046a) {
                q2 = q;
            }
            pinEntryView.mo91147c(q2);
            PinEntryView pinEntryView2 = this.f275058a;
            pinEntryView2.setSelection(Math.max(0, Math.min(spanEnd, pinEntryView2.f275046a)));
            this.f275058a.getEditableText().removeSpan(this.f275059b);
            if (this.f275058a.f275047b != null && !q2.equals(q)) {
                C98491e eVar = this.f275058a.f275047b;
                eVar.getClass();
                CollectPinActivity collectPinActivity = eVar.f275030a;
                aoq aoq = eVar.f275031b;
                if (collectPinActivity.f275024c.getText().length() > 0) {
                    collectPinActivity.f275024c.setVisibility(q2.length() > 0 ? 4 : 0);
                }
                if (q2.length() >= aoq.f135511b) {
                    aof aof = (aof) aog.f135492d.createBuilder();
                    aof.copyOnWrite();
                    aog aog = (aog) aof.instance;
                    q2.getClass();
                    aog.f135494a |= 2;
                    aog.f135496c = q2;
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 1;
                    aom.f135505a |= 1;
                    aom aom2 = (aom) aoj.build();
                    aof.copyOnWrite();
                    aog aog2 = (aog) aof.instance;
                    aom2.getClass();
                    aog2.f135495b = aom2;
                    aog2.f135494a |= 1;
                    Intent intent = new Intent();
                    intent.putExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS", new ProtoLiteParcelable((MessageLite) (aog) aof.build()));
                    collectPinActivity.mo91133a();
                    collectPinActivity.setResult(-1, intent);
                    collectPinActivity.finish();
                }
            }
            this.f275060c = false;
            this.f275061d = BuildConfig.FLAVOR;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f275060c) {
            this.f275061d = charSequence.toString();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f275060c) {
            this.f275058a.getEditableText().setSpan(this.f275059b, i, i3 + i, 256);
        }
    }
}
