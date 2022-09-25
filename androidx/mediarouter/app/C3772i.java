package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p033v7.app.C0358as;
import android.widget.ListView;
import android.widget.TextView;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.app.i */
/* compiled from: PG */
public class C3772i extends C0358as {

    /* renamed from: a */
    private final C3687aw f12178a = C3687aw.m10683e(getContext());

    /* renamed from: c */
    private final C3769f f12179c = new C3769f(this);

    /* renamed from: d */
    private TextView f12180d;

    /* renamed from: e */
    private C3753z f12181e = C3753z.f12042a;

    /* renamed from: f */
    private ArrayList f12182f;

    /* renamed from: g */
    private C3770g f12183g;

    /* renamed from: h */
    private ListView f12184h;

    /* renamed from: i */
    private boolean f12185i;

    /* renamed from: j */
    private long f12186j;

    /* renamed from: k */
    private final Handler f12187k = new C3768e(this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3772i(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.C3763ai.m10927h(r2, r0)
            int r0 = androidx.mediarouter.app.C3763ai.m10921b(r2)
            r1.<init>(r2, r0)
            androidx.mediarouter.a.z r2 = androidx.mediarouter.p175a.C3753z.f12042a
            r1.f12181e = r2
            androidx.mediarouter.app.e r2 = new androidx.mediarouter.app.e
            r2.<init>(r1)
            r1.f12187k = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.a.aw r2 = androidx.mediarouter.p175a.C3687aw.m10683e(r2)
            r1.f12178a = r2
            androidx.mediarouter.app.f r2 = new androidx.mediarouter.app.f
            r2.<init>(r1)
            r1.f12179c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C3772i.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo7988a(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                C3685au auVar = (C3685au) list.get(i);
                if (auVar.mo7761h() || !auVar.f11867g || !auVar.mo7765l(this.f12181e)) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo7989g() {
        if (this.f12185i) {
            ArrayList arrayList = new ArrayList(this.f12178a.mo7772g());
            mo7988a(arrayList);
            Collections.sort(arrayList, C3771h.f12177a);
            if (SystemClock.uptimeMillis() - this.f12186j >= 300) {
                mo7992j(arrayList);
                return;
            }
            this.f12187k.removeMessages(1);
            Handler handler = this.f12187k;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f12186j + 300);
        }
    }

    /* renamed from: h */
    public void mo7990h(C3753z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f12181e.equals(zVar)) {
            this.f12181e = zVar;
            if (this.f12185i) {
                this.f12178a.mo7774j(this.f12179c);
                this.f12178a.mo7773h(zVar, this.f12179c, 1);
            }
            mo7989g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7991i() {
        getWindow().setLayout(C3761ag.m10919a(getContext()), -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo7992j(List list) {
        this.f12186j = SystemClock.uptimeMillis();
        this.f12182f.clear();
        this.f12182f.addAll(list);
        this.f12183g.notifyDataSetChanged();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12185i = true;
        this.f12178a.mo7773h(this.f12181e, this.f12179c, 1);
        mo7989g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_chooser_dialog);
        this.f12182f = new ArrayList();
        this.f12183g = new C3770g(getContext(), this.f12182f);
        ListView listView = (ListView) mo1197b().mo1177e(R.id.mr_chooser_list);
        this.f12184h = listView;
        listView.setAdapter(this.f12183g);
        this.f12184h.setOnItemClickListener(this.f12183g);
        this.f12184h.setEmptyView(mo1197b().mo1177e(16908292));
        this.f12180d = (TextView) mo1197b().mo1177e(R.id.mr_chooser_title);
        mo7991i();
    }

    public void onDetachedFromWindow() {
        this.f12185i = false;
        this.f12178a.mo7774j(this.f12179c);
        this.f12187k.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public void setTitle(int i) {
        this.f12180d.setText(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12180d.setText(charSequence);
    }
}
