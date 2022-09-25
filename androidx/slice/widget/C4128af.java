package androidx.slice.widget;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.slice.SliceItem;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.slice.widget.af */
/* compiled from: PG */
public class C4128af extends C0640fb implements C4123aa {

    /* renamed from: a */
    final Context f13239a;

    /* renamed from: b */
    C4141as f13240b;

    /* renamed from: c */
    C4137ao f13241c;

    /* renamed from: d */
    List f13242d;

    /* renamed from: e */
    boolean f13243e;

    /* renamed from: f */
    long f13244f;

    /* renamed from: g */
    SliceView f13245g;

    /* renamed from: h */
    C4145aw f13246h;

    /* renamed from: i */
    int f13247i;

    /* renamed from: j */
    int f13248j;

    /* renamed from: k */
    int f13249k;

    /* renamed from: l */
    int f13250l;

    /* renamed from: m */
    Set f13251m = new HashSet();

    /* renamed from: n */
    boolean f13252n;

    /* renamed from: o */
    C4143au f13253o;

    /* renamed from: p */
    private final C4125ac f13254p = new C4125ac();

    /* renamed from: q */
    private List f13255q = new ArrayList();

    public C4128af(Context context) {
        this.f13239a = context;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final void mo8686a(SliceItem sliceItem, int i) {
        this.f13251m.add(sliceItem);
        if (getItemCount() > i) {
            notifyItemChanged(i);
        } else {
            this.mObservable.mo2879a();
        }
    }

    /* renamed from: b */
    public GridRowView mo8694b() {
        View inflate = LayoutInflater.from(this.f13239a).inflate(R.layout.abc_slice_grid, (ViewGroup) null);
        if (inflate instanceof GridRowView) {
            return (GridRowView) inflate;
        }
        return new GridRowView(this.f13239a, (AttributeSet) null);
    }

    /* renamed from: c */
    public C4168x mo8695c() {
        return new C4168x(this.f13239a);
    }

    /* renamed from: d */
    public final void mo8696d() {
        if (getItemCount() > 0) {
            notifyItemChanged(0);
        }
    }

    /* renamed from: e */
    public final void mo8697e(List list) {
        if (list == null) {
            this.f13251m.clear();
            this.f13255q.clear();
        } else {
            this.f13254p.f13233c.clear();
            this.f13255q = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f13255q.add(new C4127ae((C4130ah) it.next(), this.f13254p));
            }
        }
        this.mObservable.mo2879a();
    }

    public final int getItemCount() {
        return this.f13255q.size();
    }

    public final long getItemId(int i) {
        return ((C4127ae) this.f13255q.get(i)).f13238c;
    }

    public final int getItemViewType(int i) {
        return ((C4127ae) this.f13255q.get(i)).f13237b;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        boolean z;
        int i2;
        C4126ad adVar = (C4126ad) ghVar;
        C4130ah ahVar = ((C4127ae) this.f13255q.get(i)).f13236a;
        if (adVar.f13234a != null && ahVar != null) {
            C4161q h = adVar.f13235b.f13241c.mo8722h();
            adVar.f13234a.setOnClickListener(adVar);
            adVar.f13234a.setOnTouchListener(adVar);
            C4129ag agVar = adVar.f13234a;
            C4128af afVar = adVar.f13235b;
            agVar.f13264w = afVar;
            if (ahVar instanceof C4160p) {
                z = ((C4160p) ahVar).f13396h;
            } else if (i == 0) {
                i = 0;
                z = true;
            } else {
                z = false;
            }
            agVar.mo8701ft(afVar.f13251m);
            adVar.f13234a.mo8708o(adVar.f13235b.f13253o);
            adVar.f13234a.mo8645i(h.mo8754b());
            adVar.f13234a.mo8704fw(adVar.f13235b.f13241c, h);
            adVar.f13234a.mo8702fu(z && adVar.f13235b.f13243e);
            adVar.f13234a.mo8700fs(z ? adVar.f13235b.f13244f : -1);
            if (i == 0) {
                i2 = adVar.f13235b.f13248j;
                i = 0;
            } else {
                i2 = 0;
            }
            int i3 = i == adVar.f13235b.getItemCount() + -1 ? adVar.f13235b.f13250l : 0;
            C4129ag agVar2 = adVar.f13234a;
            C4128af afVar2 = adVar.f13235b;
            agVar2.mo8644g(afVar2.f13247i, i2, afVar2.f13249k, i3);
            adVar.f13234a.mo8699fr(adVar.f13235b.f13252n);
            adVar.f13234a.mo8703fv(z ? adVar.f13235b.f13242d : null);
            adVar.f13234a.mo8643fz(ahVar, z, i, adVar.f13235b.getItemCount(), adVar.f13235b.f13240b);
            adVar.f13234a.setTag(new int[]{C4154j.m11914b(ahVar, z, adVar.f13235b.f13242d), i});
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 3) {
            view = mo8694b();
        } else if (i == 4) {
            view = LayoutInflater.from(this.f13239a).inflate(R.layout.abc_slice_message, (ViewGroup) null);
        } else if (i != 5) {
            view = mo8695c();
        } else {
            view = LayoutInflater.from(this.f13239a).inflate(R.layout.abc_slice_message_local, (ViewGroup) null);
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C4126ad(this, view);
    }
}
