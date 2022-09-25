package com.google.android.apps.gsa.staticplugins.collectpin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C5543d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.staticplugins.collectpin.numericpad.NumericPinPad;
import com.google.android.apps.gsa.staticplugins.collectpin.pinentry.C98500b;
import com.google.android.apps.gsa.staticplugins.collectpin.pinentry.PinEntryView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3897e.p3921j.aof;
import com.google.assistant.p3897e.p3921j.aog;
import com.google.assistant.p3897e.p3921j.aoj;
import com.google.assistant.p3897e.p3921j.aom;
import com.google.assistant.p3897e.p3921j.aop;
import com.google.assistant.p3897e.p3921j.aoq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
public class CollectPinActivity extends C98495i {

    /* renamed from: d */
    private static final C59071e f275021d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.collectpin.CollectPinActivity");

    /* renamed from: a */
    C44565p f275022a;

    /* renamed from: b */
    PinEntryView f275023b;

    /* renamed from: c */
    public TextView f275024c;

    /* renamed from: e */
    private final void m163136e() {
        aof aof = (aof) aog.f135492d.createBuilder();
        aoj aoj = (aoj) aom.f135503c.createBuilder();
        aoj.copyOnWrite();
        aom aom = (aom) aoj.instance;
        aom.f135506b = 3;
        aom.f135505a |= 1;
        aom aom2 = (aom) aoj.build();
        aof.copyOnWrite();
        aog aog = (aog) aof.instance;
        aom2.getClass();
        aog.f135495b = aom2;
        aog.f135494a |= 1;
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS", new ProtoLiteParcelable((MessageLite) (aog) aof.build()));
        setResult(0, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo91133a() {
        C44565p pVar = this.f275022a;
        if (pVar != null) {
            pVar.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo91134b() {
        aof aof = (aof) aog.f135492d.createBuilder();
        aoj aoj = (aoj) aom.f135503c.createBuilder();
        aoj.copyOnWrite();
        aom aom = (aom) aoj.instance;
        aom.f135506b = 4;
        aom.f135505a |= 1;
        aom aom2 = (aom) aoj.build();
        aof.copyOnWrite();
        aog aog = (aog) aof.instance;
        aom2.getClass();
        aog.f135495b = aom2;
        aog.f135494a |= 1;
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS", new ProtoLiteParcelable((MessageLite) (aog) aof.build()));
        mo91133a();
        setResult(0, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int a;
        C74504a.m120462a(f.V);
        super.onCreate(bundle);
        setContentView(R.layout.collectpin_view);
        C90779c.m148334a(this, 1);
        ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) getIntent().getParcelableExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS");
        aoq aoq = protoLiteParcelable != null ? (aoq) protoLiteParcelable.mo84191d(aoq.f135508j.getParserForType()) : null;
        if (aoq == null) {
            ((C59052c) ((C59052c) f275021d.mo56225c()).mo56372aa(18994)).mo56386p("Incorrect data to launch collectpin");
            m163136e();
        } else if ((1 & aoq.f135510a) == 0 || (i = aoq.f135511b) < 4 || i > 8) {
            ((C59052c) ((C59052c) f275021d.mo56225c()).mo56372aa(18993)).mo56386p("Invalid pin length, needs to be >=4 and <=8");
            m163136e();
        } else {
            this.f275022a = new C44565p(this, R.style.BottomSheetDialogTheme);
            View inflate = LayoutInflater.from(this).inflate(R.layout.collecpin_bottom_sheet, (ViewGroup) findViewById(R.id.collect_pin_container));
            this.f275022a.setContentView(inflate);
            this.f275022a.setCanceledOnTouchOutside(false);
            this.f275022a.setOnCancelListener(new C98487a(this));
            BottomSheetBehavior h = this.f275022a.mo47541h();
            h.mo47519v(3);
            h.mo47506D(new C98492f(h));
            if ((aoq.f135510a & 2) != 0) {
                ((TextView) inflate.findViewById(R.id.collect_pin_header)).setText(aoq.f135512c);
            }
            if ((aoq.f135510a & 4) != 0) {
                C5543d.m14323c(this).mo12422a(this).mo11873k(aoq.f135513d).mo12454r((ImageView) inflate.findViewById(R.id.collect_pin_header_logo));
            }
            this.f275024c = (TextView) inflate.findViewById(R.id.collect_pin_error_message);
            int i2 = aoq.f135510a;
            if (!((i2 & 32) == 0 || (i2 & 16) == 0 || (a = aop.m86354a(aoq.f135515f)) == 0 || a != 3)) {
                this.f275024c.setText(aoq.f135516g);
                this.f275024c.setVisibility(0);
            }
            int i3 = aoq.f135510a;
            if (!((i3 & 128) == 0 || (i3 & 64) == 0)) {
                String str = aoq.f135517h;
                if (str.startsWith("https://") || str.startsWith("http://")) {
                    Button button = (Button) inflate.findViewById(R.id.forgot_pin_button);
                    button.setText(aoq.f135518i);
                    button.setOnClickListener(new C98488b(this, aoq));
                    button.setVisibility(0);
                }
            }
            ((ImageView) inflate.findViewById(R.id.cancel_icon)).setOnClickListener(new C98489c(this));
            ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new C98490d(this));
            PinEntryView pinEntryView = (PinEntryView) inflate.findViewById(R.id.pin_entry);
            this.f275023b = pinEntryView;
            pinEntryView.f275046a = 4;
            pinEntryView.f275047b = new C98491e(this, aoq);
            pinEntryView.requestFocus();
            this.f275023b.setSelection(0);
            PinEntryView pinEntryView2 = this.f275023b;
            pinEntryView2.mo91147c(BuildConfig.FLAVOR);
            pinEntryView2.addTextChangedListener(new C98500b(pinEntryView2));
            PinEntryView pinEntryView3 = this.f275023b;
            pinEntryView3.requestFocus();
            pinEntryView3.setSelection(0);
            pinEntryView3.setInputType(0);
            ((NumericPinPad) inflate.findViewById(R.id.numeric_pin_pad)).f275042f = new C98493g(pinEntryView3);
            this.f275022a.show();
        }
    }
}
