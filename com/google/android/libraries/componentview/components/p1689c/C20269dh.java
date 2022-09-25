package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20135be;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20136bf;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20608ch;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.application.NavigationParams;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.componentview.components.c.dh */
/* compiled from: PG */
public class C20269dh extends C20061bs {

    /* renamed from: a */
    public boolean f56878a = false;

    /* renamed from: b */
    private final C20609ci f56879b;

    /* renamed from: c */
    private C20136bf f56880c;

    /* renamed from: d */
    private EditText f56881d;

    /* renamed from: e */
    private View f56882e;

    /* renamed from: f */
    private TextView f56883f;

    public C20269dh(Context context, C56425d dVar, C20601ca caVar, C20609ci ciVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56879b = ciVar;
    }

    /* renamed from: A */
    private final void m38110A(String str) {
        C56429h H = mo25419H();
        if (H != null) {
            C20613d dVar = new C20613d();
            dVar.f57814a = str;
            dVar.mo25530c(H.f150556h);
            dVar.f57818e = H.f150553e;
            dVar.f57819f = H.f150554f;
            dVar.f57817d = H.f150558j;
            this.f56308s.mo21037a(dVar.mo25528a());
        }
    }

    /* renamed from: B */
    private final void m38111B() {
        this.f56883f.setVisibility(0);
        this.f56881d.setBackgroundResource(R.drawable.nqsb_edittext_error_background);
        this.f56878a = true;
    }

    /* renamed from: n */
    private final String m38112n(String str, String str2, String str3) {
        if (str.contains(str2)) {
            return str.replaceAll(Pattern.quote(str2), str3);
        }
        C20598by G = mo25418G();
        G.mo25535e(C19742a.INVALID_URI);
        G.mo25536f("Query template " + str + "does not contain placeholder" + str2);
        C20520h.m38498c("NavquerySearchboxComponent", G.mo25531a(), this.f56308s, new Object[0]);
        return null;
    }

    /* renamed from: o */
    private final void m38113o(String str) {
        String n = m38112n(this.f56880c.f56460d, Uri.encode("{searchTerms}"), str);
        if (n != null) {
            try {
                Intent parseUri = Intent.parseUri(n, 1);
                if (this.f56879b.mo21040b(parseUri)) {
                    m38110A(n);
                    return;
                }
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_INTENT);
                G.mo25536f("Deep link query intent not handled: ".concat(String.valueOf(parseUri.toString())));
                C20520h.m38498c("NavquerySearchboxComponent", G.mo25531a(), this.f56308s, new Object[0]);
            } catch (URISyntaxException e) {
                C20598by G2 = mo25418G();
                G2.mo25535e(C19742a.INVALID_URI);
                G2.mo25536f("URISyntaxException when parsing deep link query template".concat(n));
                G2.mo25534d(e.getMessage());
                C20520h.m38498c("NavquerySearchboxComponent", G2.mo25531a(), this.f56308s, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.navquery_searchbox, (ViewGroup) null);
        this.f56881d = (EditText) viewGroup.findViewById(R.id.searchbox);
        this.f56882e = viewGroup.findViewById(R.id.search_button);
        this.f56883f = (TextView) viewGroup.findViewById(R.id.error_text);
        return viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20136bf.f56455j);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20136bf bfVar = (C20136bf) obj;
        this.f56880c = bfVar;
        this.f56881d.setHint(bfVar.f56458b);
        this.f56882e.setContentDescription(this.f56880c.f56462f);
        this.f56883f.setText(this.f56880c.f56461e);
        boolean z = this.f56880c.f56463g;
        this.f56878a = z;
        if (z) {
            m38111B();
        } else {
            mo25316m();
        }
        this.f56881d.addTextChangedListener(new C20268dg(this));
        this.f56881d.setOnEditorActionListener(new C20266de(this));
        this.f56882e.setOnClickListener(new C20267df(this));
    }

    /* renamed from: i */
    public final void mo25315i() {
        String encode = Uri.encode(this.f56881d.getText().toString());
        if (!encode.isEmpty()) {
            C20136bf bfVar = this.f56880c;
            if ((bfVar.f56457a & 4) != 0) {
                m38113o(encode);
            } else if (bfVar.f56464h) {
                String n = m38112n(bfVar.f56459c, "{searchTerms}", encode);
                if (n != null) {
                    this.f56879b.mo21039a(n, NavigationParams.m38563c().mo25555a());
                    m38110A(n);
                }
            } else {
                String n2 = m38112n(bfVar.f56459c, "{searchTerms}", encode);
                if (n2 != null) {
                    C56429h H = mo25419H();
                    if (H != null) {
                        n2 = Uri.parse(n2).buildUpon().appendQueryParameter("ved", H.f150556h).toString();
                    }
                    C20609ci ciVar = this.f56879b;
                    C20608ch c = NavigationParams.m38563c();
                    c.mo25556b(true);
                    ciVar.mo21039a(n2, c.mo25555a());
                }
            }
        } else if (!this.f56878a) {
            m38111B();
        }
    }

    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C20135be beVar = (C20135be) this.f56880c.toBuilder();
        boolean z = this.f56878a;
        beVar.copyOnWrite();
        C20136bf bfVar = (C20136bf) beVar.instance;
        bfVar.f56457a |= 32;
        bfVar.f56463g = z;
        this.f56880c = (C20136bf) beVar.build();
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20136bf.f56455j, this.f56880c);
        return (C56425d) cVar.build();
    }

    /* renamed from: m */
    public final void mo25316m() {
        this.f56883f.setVisibility(8);
        this.f56881d.setBackgroundResource(R.drawable.nqsb_edittext_background);
        this.f56878a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo25192p(float f, float f2, float f3, float f4) {
    }
}
