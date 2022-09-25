package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.search.shared.actions.util.C87493o;
import com.google.android.apps.gsa.search.shared.p6930h.C87570m;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4152bb.p4153a.C55293n;
import com.google.protobuf.C63088z;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* compiled from: PG */
public class OpaSliceCard extends LinearLayout implements C73867g {

    /* renamed from: a */
    public Optional f300922a = Optional.empty();

    /* renamed from: b */
    private final Context f300923b;

    /* renamed from: c */
    private ImageView f300924c;

    /* renamed from: d */
    private SliceView f300925d;

    /* renamed from: e */
    private String f300926e;

    /* renamed from: f */
    private int f300927f;

    /* renamed from: g */
    private byte[] f300928g;

    /* renamed from: h */
    private String f300929h;

    public OpaSliceCard(Context context) {
        super(context);
        this.f300923b = context;
        this.f300927f = 1;
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        C55293n nVar;
        a createBuilder = b.f.createBuilder();
        String str = this.f300926e;
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        byte[] bArr = this.f300928g;
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            createBuilder.copyOnWrite();
            b bVar2 = createBuilder.instance;
            bVar2.a |= 4;
            bVar2.d = A;
        }
        if (!C58837ba.m90859h(this.f300929h)) {
            try {
                nVar = C87493o.m142022d(Intent.parseUri(this.f300929h, 0));
            } catch (URISyntaxException unused) {
                nVar = null;
            }
            if (nVar != null) {
                createBuilder.copyOnWrite();
                b bVar3 = createBuilder.instance;
                bVar3.e = nVar;
                bVar3.a |= 8;
            }
        }
        SettableFuture settableFuture = new SettableFuture();
        post(new C108377gl(settableFuture, createBuilder));
        return settableFuture;
    }

    /* renamed from: b */
    public final void mo96567b(Integer num) {
        ImageView imageView = this.f300924c;
        if (imageView != null && num != null) {
            imageView.setImageDrawable(this.f300923b.getDrawable(num.intValue()));
        }
    }

    /* renamed from: c */
    public final boolean mo96568c(String str, String str2, int i, byte[] bArr, String str3) {
        this.f300926e = str2;
        this.f300927f = i;
        this.f300928g = bArr;
        this.f300929h = str3;
        this.f300925d.mo8673h(i);
        C87570m mVar = new C87570m(this.f300923b, str, this.f300925d);
        this.f300925d.mo8669d(new C108376gk(this, mVar));
        return mVar.mo81692d();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f300924c = (ImageView) findViewById(R.id.icon);
        View findViewById = findViewById(R.id.slice_view);
        findViewById.getClass();
        SliceView sliceView = (SliceView) findViewById;
        this.f300925d = sliceView;
        sliceView.mo8673h(this.f300927f);
        SliceView sliceView2 = this.f300925d;
        C28292j jVar = new C28292j(77601);
        jVar.mo33795i(4);
        jVar.mo33795i(31);
        C28295m.m52919e(sliceView2, jVar);
    }

    public OpaSliceCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f300923b = context;
        this.f300927f = 1;
    }

    public OpaSliceCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f300923b = context;
        this.f300927f = 1;
    }
}
