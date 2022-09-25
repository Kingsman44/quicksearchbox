package com.facebook.litho.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6411u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.litho.widget.dx */
/* compiled from: PG */
class C6519dx extends EditText implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public C6154cb f19394a;

    /* renamed from: b */
    public C6154cb f19395b;

    /* renamed from: c */
    public C6154cb f19396c;

    /* renamed from: d */
    public C6154cb f19397d;

    /* renamed from: e */
    public C6154cb f19398e;

    /* renamed from: f */
    public C6154cb f19399f;

    /* renamed from: g */
    public C6411u f19400g;

    /* renamed from: h */
    public AtomicReference f19401h;

    /* renamed from: i */
    public TextWatcher f19402i;

    /* renamed from: j */
    private int f19403j = -1;

    public C6519dx(Context context) {
        super(context);
        setOnEditorActionListener(this);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C6154cb cbVar = this.f19398e;
        if (cbVar == null) {
            return false;
        }
        C6556u uVar = new C6556u();
        uVar.f19530a = textView;
        return ((Boolean) cbVar.f18197b.mo13127l().mo12795N(cbVar, uVar)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f19403j = getLineCount();
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C6411u uVar;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.f19401h;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        C6154cb cbVar = this.f19394a;
        if (cbVar != null) {
            String obj = charSequence.toString();
            C6511dp dpVar = new C6511dp();
            dpVar.f19332a = this;
            dpVar.f19333b = obj;
            cbVar.f18197b.mo13127l().mo12795N(cbVar, dpVar);
        }
        int lineCount = getLineCount();
        int i4 = this.f19403j;
        if (i4 != -1 && i4 != lineCount && (uVar = this.f19400g) != null) {
            int i5 = C6517dv.f19363W;
            if (uVar.f19012e != null) {
                uVar.mo13350h(new C6278fu(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
            }
        }
    }
}
