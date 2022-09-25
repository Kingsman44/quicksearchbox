package com.google.android.libraries.lens.view.p2068al;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27014b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.hilt.p5299a.C68288b;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.al.b */
/* compiled from: PG */
public final class C25289b extends C25291d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25290c f68788a;

    /* renamed from: b */
    private Context f68789b;

    /* renamed from: c */
    private final C2393x f68790c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f68791d = new C47515ab(this);

    /* renamed from: e */
    private boolean f68792e;

    @Deprecated
    public C25289b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25290c mo17754z() {
        C25290c cVar = this.f68788a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f68792e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30367b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f68789b == null) {
            this.f68789b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f68789b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f68791d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f68790c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f68791d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f68791d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f68791d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f68791d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f68791d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f68791d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        this.f68791d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25290c a = mo17754z();
            viewGroup.getClass();
            viewGroup.setVisibility(0);
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.prewarming_view, viewGroup, false);
            C63088z A = C63088z.m96139A(Base64.decode("EuIgCix0eXBlLmdvb2dsZWFwaXMuY29tL3lvdXR1YmUuZWxlbWVudHMuRWxlbWVudBKxIAr-H8rr6oMF9x8aLpLLoZAFKAomZmFpbHVyZV9pbmZvX2NhcmQuZW1sfGUxY2IzODMxM2Q3YzNiMWUqxB_C6qaqB70fGoseCoEDCKTCgPkPEP____8PGKTCgLkDIIuNgvwPKOC56_4PMIuNgvwPOLPmzfgPQICAgMgBSPKLivoPUOC56_4PWIuNgvwPYMOA8fkPaKbB6vwPcPTnx_8PeP____8PgAHoxv36D4gB6Ofp-A-QAfzHy_4PmAHguev-D6AB862G-Q-oAfjx4_8PsAH_____D8AB_____w_IAaHChIEI0AH_____D9gBAOAB_uGj_w_oAdLP5fgPiALDgPH5D5AC0s_l-A-YAoT47v8PoAKLjYL8D7AC6Mb9-g-4Av____8PwAL8x8v-D8gCuIDi-A_QAgDYAujn6fgP4ALguev-D-gC8ouK-g_wAoCAgNAB-AKkwoD5D4AD6Ofp-A-IA4CAgECQA-jI_foPmAPoxv36D6ADpMKA-Q-oA-HChfsPsAP058f_D7gD6Mb9-g_AA-C56_4PyAP68-P_D9AD7dWj_w_gAwDoA4T47v8P8APo5-n4D_gD6Ofp-A-ABP____8PiATSz-XQARL9BwoaChNnb29nbGUtc2Fucy1yZWd1bGFyFQAAYEESGQoSc2Fucy1zZXJpZi1yZWd1bGFyFQAAQEEaGQoSc2Fucy1zZXJpZi1yZWd1bGFyFQAAkEEiFwoQZ29vZ2xlLXNhbnMtYm9sZBUAAEBBKhkKEnNhbnMtc2VyaWYtcmVndWxhchUAAFBBMhkKEnNhbnMtc2VyaWYtcmVndWxhchUAADBBOhgKEXNhbnMtc2VyaWYtbWVkaXVtFQAAQEFCGAoRc2Fucy1zZXJpZi1tZWRpdW0VAACQQUoSCgtyb2JvdG8tYm9sZBUAAGBBUhkKEnNhbnMtc2VyaWYtcmVndWxhchUAAGBBWhgKEXNhbnMtc2VyaWYtbWVkaXVtFQAAYEFiFQoOcm9ib3RvLXJlZ3VsYXIVAABgQWoZChJzYW5zLXNlcmlmLXJlZ3VsYXIVAABgQXIZChJnb29nbGUtc2Fucy1tZWRpdW0VAABgQXoZChJnb29nbGUtc2Fucy1tZWRpdW0VAABgQYIBFAoNcm9ib3RvLW1lZGl1bRUAAFBBigEUCg1yb2JvdG8tbWVkaXVtFQAAIEGSAR8KGHNhbnMtc2VyaWYtbWVkaXVtLWl0YWxpYxUAAEBBogEVCg5yb2JvdG8tcmVndWxhchUAAGBBqgESCgtyb2JvdG8tYm9sZBUAAGBBsgESCgtnb29nbGUtc2FucxUAAJBBugEZChJnb29nbGUtc2Fucy1tZWRpdW0VAABgQcIBFQoOcm9ib3RvLXJlZ3VsYXIVAABgQcoBGQoSZ29vZ2xlLXNhbnMtbWVkaXVtFQAAYEHSARkKEmdvb2dsZS1zYW5zLW1lZGl1bRUAAGBB2gEaChNnb29nbGUtc2Fucy1yZWd1bGFyFQAAkEHiARUKDnJvYm90by1yZWd1bGFyFQAAQEHqARUKDnJvYm90by1yZWd1bGFyFQAAkEHyARkKEmdvb2dsZS1zYW5zLW1lZGl1bRUAAGBB-gEVCg5yb2JvdG8tcmVndWxhchUAAEBBggIOCgdjYXB0aW9uFQAAIEGKAhkKEmdvb2dsZS1zYW5zLW1lZGl1bRUAAIBBkgIUCg1yb2JvdG8tbWVkaXVtFQAAYEGaAhoKE2dvb2dsZS1zYW5zLXJlZ3VsYXIVAACQQaICGQoSZ29vZ2xlLXNhbnMtbWVkaXVtFQAAYEGqAhUKDnJvYm90by1yZWd1bGFyFQAAQEGyAhkKEmdvb2dsZS1zYW5zLW1lZGl1bRUAAIBBugIVCg5yb2JvdG8tcmVndWxhchUAAJBBwgISCgtnb29nbGUtc2FucxUAAGBBygIXChBnb29nbGUtc2Fucy1ib2xkFQAAYEEaMg0AAKBAFQAAAEEdAAAQQSUAADBBLQAAMEE1AAAAQT0AAABBRQAAgEFNAACAQVUAAMBBIk0IAxAALQAAQEAwA0gBVQAAAEFYAGABaAB9AABIQ4UBAABAQYgBAJUBAAAAQZgBAKABAKgBAbUBAAAAQcABAcgBAdABAd0BAAAAQeABASrADwpdaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vaW1hZ2VzL2ljb25zL21hdGVyaWFsL3N5c3RlbS8xeC9vcGVuX2luX25ld195b3V0dWJlX2RhcmtibHVlXzM2ZHAucG5nElZodHRwczovL3d3dy5nc3RhdGljLmNvbS9pbWFnZXMvaWNvbnMvbWF0ZXJpYWwvc3lzdGVtLzF4L2ltYWdlX3NlYXJjaF9nb29nYmx1ZV80OGRwLnBuZxpSaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vaW1hZ2VzL2ljb25zL21hdGVyaWFsL3N5c3RlbS8xeC9vcGVuX2luX25ld193aGl0ZV80OGRwLnBuZyJPaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vaW1hZ2VzL2JyYW5kaW5nL3Byb2R1Y3QvMngvZ29vZ2xlX3NlYXJjaF9yb3VuZF8yNGRwLnBuZyp1aHR0cHM6Ly9mb250cy5nc3RhdGljLmNvbS9zL2kvZ29vZ2xlbWF0ZXJpYWxpY29ucy9uYXZpZ2F0ZV9uZXh0L3YxMC9nbV9ibHVlLTI0ZHAvMngvZ21fbmF2aWdhdGVfbmV4dF9nbV9ibHVlXzI0ZHAucG5nMkpodHRwczovL3d3dy5nc3RhdGljLmNvbS9sZW5zL3VpL2ljb24vbGVuc19rZXlib2FyZF9hcnJvd19yaWdodF9ibHVlNjAwLnBuZzpVaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vaW1hZ2VzL2ljb25zL21hdGVyaWFsL3N5c3RlbS8xeC9vcGVuX2luX25ld19nb29nYmx1ZV8zNmRwLnBuZ0I6aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvYXV0b19mYWlsdXJlLnBuZ0o7aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvYXV0b19mYWxsYmFjay5wbmdSPGh0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL2RpbmluZ19mYWlsdXJlLnBuZ1pEaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvZGluaW5nX3BhcnRpYWxfZmFpbHVyZS5wbmdiQmh0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL3Byb2R1Y3Rpdml0eV9mYWlsdXJlLnBuZ2o-aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvc2hvcHBpbmdfZmFpbHVyZS5wbmdyP2h0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL3RyYW5zbGF0ZV9mYWlsdXJlLnBuZ3o_aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvZWR1Y2F0aW9uX2ZhaWx1cmUucG5nggE7aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvcGxhY2VfZmFpbHVyZS5wbmeKAYABaHR0cHM6Ly9mb250cy5nc3RhdGljLmNvbS9zL2kvZ29vZ2xlbWF0ZXJpYWxpY29ucy9rZXlib2FyZF9hcnJvd19kb3duL3Y2L2dtX2dyZXktMjRkcC8yeC9nbV9rZXlib2FyZF9hcnJvd19kb3duX2dtX2dyZXlfMjRkcC5wbmeSAXxodHRwczovL2ZvbnRzLmdzdGF0aWMuY29tL3MvaS9nb29nbGVtYXRlcmlhbGljb25zL2tleWJvYXJkX2Fycm93X3VwL3Y2L2dtX2dyZXktMjRkcC8yeC9nbV9rZXlib2FyZF9hcnJvd191cF9nbV9ncmV5XzI0ZHAucG5nmgFHaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvbGVuc19saWdodF9tb2RlX2Z1bGxfc3Rhci5wbmeiAUdodHRwczovL3d3dy5nc3RhdGljLmNvbS9sZW5zL2NhcmRzL2Fzc2V0cy9sZW5zX2xpZ2h0X21vZGVfaGFsZl9zdGFyLnBuZ6oBSGh0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL2xlbnNfbGlnaHRfbW9kZV9lbXB0eV9zdGFyLnBuZ7IBM2h0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL3NhZF9nLnBuZ7oBdWh0dHBzOi8vZm9udHMuZ3N0YXRpYy5jb20vcy9pL2dvb2dsZW1hdGVyaWFsaWNvbnMvbmF2aWdhdGVfbmV4dC92MTAvZ21fZ3JleS0yNGRwLzJ4L2dtX25hdmlnYXRlX25leHRfZ21fZ3JleV8yNGRwLnBuZ8IBPGh0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL3JlZ2lvbl9mYWlsdXJlLnBuZ8oBN2h0dHBzOi8vd3d3LmdzdGF0aWMuY29tL2xlbnMvY2FyZHMvYXNzZXRzL2F1dG9faWNvbi5wbmcybwikwoD5DxDoxv36Dxjoxv36DyCLjYL8Dyj_____DzDSz-X4Dzj_____D0D_____D0j_____D1D_____D1jo5-n4D2D-4aP_D2iE-O7_D3CX9un_D3j058f_D4AB7dWj_w-IAeC56_4PkAH8x8v-DzrNAQoaChNnb29nbGUtc2Fucy1yZWd1bGFyFQAAkEESGQoSZ29vZ2xlLXNhbnMtbWVkaXVtFQAAgEEaGQoSZ29vZ2xlLXNhbnMtbWVkaXVtFQAAYEEiGgoTZ29vZ2xlLXNhbnMtcmVndWxhchUAAGBBKhUKDnJvYm90by1yZWd1bGFyFQAAYEEyFQoOcm9ib3RvLXJlZ3VsYXIVAABAQToUCg1yb2JvdG8tbWVkaXVtFQAAMEFCGQoSZ29vZ2xlLXNhbnMtbWVkaXVtFQAAQEFqrAEKO1RyeSBpdCBvbiB0ZXh0IHRvIHRyYW5zbGF0ZSwgb3Igc2VsZWN0IGEgZGlmZmVyZW50IGxhbmd1YWdlElYKQQo_aHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vbGVucy9jYXJkcy9hc3NldHMvdHJhbnNsYXRlX2ZhaWx1cmUucG5nEhF0cmFuc2xhdGVfZmFpbHVyZTIPCM-2BBgAIgc3MjUyNy4wOgQQASgAEi7ChqW7BSgKJmZhaWx1cmVfaW5mb19jYXJkLmVtbHxlMWNiMzgzMTNkN2MzYjFlGpwvCtUOCiZmYWlsdXJlX2luZm9fY2FyZC5lbWx8ZTFjYjM4MzEzZDdjM2IxZRKqDgozdHlwZS5nb29nbGVhcGlzLmNvbS95b3V0dWJlLmVsZW1lbnRzLlRlbXBsYXRlQ29uZmlnEvINssfOhwXrDRLeDQoECBwQBRIECAEYARK_DQgCGAIiuA0atQ0KEQgBEg0aCwoJCMTI4UwSAhoACp8NCAMSmg1alw0IARKNASKKAQqHAQoMEgoIAxICCAcSAggFEncadQpzCAESbxptCmsIua29UBJkGmIKPggDEjoaOAo2CLKZhFISLxotCisIARInMiUKIwohY2FyZF9kaXZpZGVyLmVtbHw5NmNhOTdlMmYxNDBjMjM2CiAIBRIcGhoKGAjt_dWWARIQGg4KDAgBEggSBggBEgIIAxKCDBr_CwodCAESGRoXChUIp5TcSxIOGgwKCggBEgYyBAoCCAEKrQEIAhKoARqlAQpACISLvVASORo3CgoIChIGMgQKAggBCgoICxIGMgQKAggCCh0ICRIZGhcKFQgDEhEaDwoNCAESCTIHCgUNAAAAQQoVCJWXvVASDhoMCgoIARIGMgQKAggACkoIxaPqeRJDGkEKEAgCEgwSCggDEgIIBhICCAQKLQiikpJ7EiYaJAoQCAESDBIKCAMSAggGEgIIAQoQCAMSDBIKCAMSAggGEgIIAwqtCggDEqgKWqUKCAES4Aga3QgKEQgBEg0aCwoJCKeU3EsSAhoACjUIAhIxGi8KLQiEi71QEiYaJAoKCAoSBjIECgIIAwoKCAsSBjIECgIIAQoKCAwSBjIECgIIAgqQCAgDEosIWogICAES5wEi5AEK4QEKJFIiCAESHkocCAESCAgcMgQKAggAGg5SDAgCEggSBggDEgIIAxK4ARq1AQqAAQgBEnwaegp4CLmtvVAScRpvCj0IAxI5GjcKNQiymYRSEi4aLAoqCAESJjIkCiIKIGNhcmRfaGVhZGVyLmVtbHwxMWI3Yzc0NmY3MTczYzYyCi4IBRIqGigKJgjAi9qYARIeGhwKDAgBEggSBggDEgIIAwoMCAISCBIGCAESAggDCjAIAhIsGioKKAiEi71QEiEaHwodCAgSGRoXChUIBRIRGg8KDQgBEgkyBwoFDQAAQEES1QEa0gEKnQEIARKYARqVAQqSAQjclNxLEooBGocBCgoIAhIGMgQKAggICnkIARJ1GnMKVAgGElA6TgpMGkoKGAgDEhQSEggBEgIIAxICCAISAggKEgIIAQoYCAQSFBISCAESAggDEgIIAhICCAoSAggCChQIBRIQEg4IARICCAMSAggBEgIIBAoNCAISCTIHCgUNAABAQAoMCAESCBIGCAMSAggBCjAIAhIsGioKKAiEi71QEiEaHwodCAgSGRoXChUIBRIRGg8KDQgBEgkyBwoFDQAAwEESwQQivgQKuwQKWFpWCAISKFImCAESIkogCAESCAgcMgQKAggAGhJSEAgCEgwSCggDEgIIBRICCAESKFImCAESIkogCAESCAgcMgQKAggAGhJSEAgCEgwSCggDEgIIBRICCAIS3gMa2wMKEQgBEg0aCwoJCKeU3EsSAhoACq4CCAISqQIapgIKkwEIhIu9UBKLARqIAQoKCAwSBjIECgIIBAoKCAsSBjIECgIIAwoKCAoSBjIECgIIAQoVCAISERoPCg0IARIJMgcKBQ0AABBCCksICBJHGkUKFQgBEhEaDwoNCAESCTIHCgUNAACAQQoVCAYSERoPCg0IARIJMgcKBQ0AAMBBChUIBRIRGg8KDQgBEgkyBwoFDQAAwEEKLgiVl71QEicaJQoUCAESEBIOCAESAggDEgIIARICCD4KDQgFEgkyBwoFDQAAgEAKXgi5l71QElcaVQpTCAESTyJNCksKKFImCAESIkogCAESCAgcMgQKAggAGhJSEAgCEgwSCggDEgIIBRICCAISHxodChsI9L_8XRIUGhIKEAgBEgwSCggDEgIIBRICCAIKlAEIAxKPAVqMAQgBEocBGoQBCoEBCAESfRp7CnkI3JTcSxJyGnAKbggBEmoaaApUCAYSUDpOCkwaSgoUCAUSEBIOCAESAggDEgIIARICCEAKGAgDEhQSEggBEgIIAxICCAISAggZEgIIAQoYCAQSFBISCAESAggDEgIIAhICCBkSAggCChAIARIMEgoIAxICCAUSAggBEr0BGroBCj0IARI5GjcKNQi5lNxLEi4aLAoqCAESJhokCiIIARIeWhwIARIYGhYKFAgBEhASDggDEgIIAhICCAESAggBCnkIAhJ1GnMKcQiEi71QEmoaaAoKCBASBjIECgIIAgoNCA4SCTIHCgUNAAAAAAodCAgSGRoXChUIBxIRGg8KDQgBEgkyBwoFDQAAwEEKFQgCEhEaDwoNCAESCTIHCgUNAADkQgoVCAMSERoPCg0IARIJMgcKBQ0AAORCEg4IAxgEIggSBggBEgIIDRjB3ILK2_nsqwoKoR0KIGNhcmRfaGVhZGVyLmVtbHwxMWI3Yzc0NmY3MTczYzYyEvwcCjN0eXBlLmdvb2dsZWFwaXMuY29tL3lvdXR1YmUuZWxlbWVudHMuVGVtcGxhdGVDb25maWcSxByyx86HBb0cErAcCgQIEBAFCgQIFxAJEgQIARgBEuQbCAIYAiLdGxraGwoRCAESDRoLCgkIp5TcSxICGgAKxBsIAxK_G1q8GwgBErcbIrQbCsoNChASDggBEgIIAhICCAQSAggcErUNGrINChEIARINGgsKCQinlNxLEgIaAArAAQgCErsBGrgBCrUBCISLvVASrQEaqgEKCggKEgYyBAoCCAMKjwEICBKKARqHAQpTCAMSTxpNCksIARJHIkUKOAooUiYIARIiSiAIARIICBAyBAoCCAAaElIQCAISDBIKCAESAggBEgIIChIMEgoIARICCAESAggKEgkyBwoFDQAAgEEKMAgBEiwaKgooCAESJCIiChUKCBIGCAMSAggJEgkyBwoFDQAAAEESCTIHCgUNAAAAAAoKCAwSBjIECgIIBQrZCwgDEtQLWtELCAESuwIauAIKEQgBEg0aCwoJCKeU3EsSAhoACjgIAhI0GjIKMAiEi71QEikaJwoKCAoSBjIECgIIAQoKCAsSBjIECgIIAQoNCA0SCTIHCgUNAACAPwroAQgDEuMBWuABCAES2wEa2AEKjAEIARKHARqEAQqBAQjclNxLEnoaeApqCAESZhpkClQIBhJQOk4KTBpKChQIBRIQEg4IARICCAISAggBEgIIAQoYCAMSFBISCAESAggCEgIIAhICCCMSAggBChgIBBIUEhIIARICCAISAggCEgIIIxICCAIKDAgBEggSBggDEgIIAQoKCAISBjIECgIIAgpHCAISQxpBCj8IhIu9UBI4GjYKNAgIEjAaLgoVCAUSERoPCg0IARIJMgcKBQ0AAEBBChUIBhIRGg8KDQgBEgkyBwoFDQAAQEESoQYingYKmwYKKFImCAESIkogCAESCAgQMgQKAggAGhJSEAgCEgwSCggDEgIICBICCAIS7gUa6wUKEQgBEg0aCwoJCKeU3EsSAhoACmsIAhJnGmUKYwiEi71QElwaWgoKCAoSBjIECgIIAQodCAgSGRoXChUIBRIRGg8KDQgBEgkyBwoFDQAAQEEKFQgCEhEaDwoNCAESCTIHCgUNAACgQQoKCAwSBjIECgIIBQoKCAsSBjIECgIIAQroBAgDEuMEWuAECAESyAEaxQEKkAEIARKLARqIAQqFAQjclNxLEn4afApuCAESahpoClQIBhJQOk4KTBpKChQIBRIQEg4IARICCAISAggBEgIIPQoYCAMSFBISCAESAggCEgIIAhICCAESAggBChgIBBIUEhIIARICCAISAggCEgIIARICCAIKEAgBEgwSCggDEgIICBICCAIKCggCEgYyBAoCCAEKMAgCEiwaKgooCISLvVASIRofCh0ICBIZGhcKFQgGEhEaDwoNCAESCTIHCgUNAAAAQBLEASrBAQgFEgwSCggDEgIICBICCAEaqgEapwEKRQgBEkEaPwo9CLmU3EsSNho0CjIIARIuGiwKCggCEgYyBAoCCAIKHggBEhpaGAgBEhQaEgoQCAESDBIKCAUSAggBEgIIAQpeCAISWhpYClYIhIu9UBJPGk0KHQgIEhkaFwoVCAESERoPCg0IARIJMgcKBQ0AAEBAChUIAxIRGg8KDQgBEgkyBwoFDQAAYEEKFQgCEhEaDwoNCAESCTIHCgUNAABgQSAGKAcSyQEixgEKwwEKKFImCAESIkogCAESCAgQMgQKAggAGhJSEAgCEgwSCggDEgIICBICCAMSlgEakwEKkAEIARKLARqIAQqFAQjclNxLEn4afApuCAESahpoClQIBhJQOk4KTBpKChQIBRIQEg4IARICCAISAggBEgIIEAoYCAMSFBISCAESAggCEgIIAhICCAESAggBChgIBBIUEhIIARICCAISAggCEgIIARICCAIKEAgBEgwSCggDEgIICBICCAMKCggCEgYyBAoCCAES6gIi5wIK5AIKJFIiCAESHkocCAESCAgQMgQKAggAGg5SDAgCEggSBggDEgIIAhK7Ahq4AgoRCAESDRoLCgkIp5TcSxICGgAKOAgCEjQaMgowCISLvVASKRonCgoIChIGMgQKAggBCgoICxIGMgQKAggBCg0IDRIJMgcKBQ0AAIA_CugBCAMS4wFa4AEIARLbARrYAQqMAQgBEocBGoQBCoEBCNyU3EsSehp4CmoIARJmGmQKVAgGElA6TgpMGkoKFAgFEhASDggBEgIIAhICCAESAggQChgIAxIUEhIIARICCAISAggCEgIIARICCAEKGAgEEhQSEggBEgIIAhICCAISAggBEgIIAgoMCAESCBIGCAMSAggCCgoIAhIGMgQKAggBCkcIAhJDGkEKPwiEi71QEjgaNgo0CAgSMBouChUIBRIRGg8KDQgBEgkyBwoFDQAAQEEKFQgGEhEaDwoNCAESCTIHCgUNAABAQRLkDRrhDQoRCAESDRoLCgkIp5TcSxICGgAKdwgCEnMacQpvCISLvVASaBpmCiIIChIeIhwKEgoIEgYIAxICCAMSBjIECgIIAxIGMgQKAggBCjQICBIwGi4KFQgDEhEaDwoNCAESCTIHCgUNAACAQQoVCAESERoPCg0IARIJMgcKBQ0AAABBCgoICxIGMgQKAggDCtIMCAMSzQxaygwIARKyBRqvBQoRCAESDRoLCgkIp5TcSxICGgAKmQIIAhKUAhqRAgqdAQiEi71QEpUBGpIBCgoIChIGMgQKAggDCgoICxIGMgQKAggDChAIBRIMGgoKCAgBEgQSAggECmYICBJiGmAKMAgDEiwaKgooCAESJCIiChUKCBIGCAMSAggDEgkyBwoFDQAAgEESCTIHCgUNAAAAAAoVCAISERoPCg0IARIJMgcKBQ0AAIBBChUIBBIRGg8KDQgBEgkyBwoFDQAAgEEKbwjrmL1QEmgaZgpkCAESYCJeClIKJFIiCAESHkocCAESCAgQMgQKAggAGg5SDAgCEggSBggDEgIIAhIqWigIBRIMMgoKCAoGJDAsICQxEgoIFxIGCAMSAggBEgoIFxIGCAMSAggCEggSBggDEgIIAQr9AggDEvgCWvUCCAESrAEaqQEKpgEIARKhARqeAQqbAQjclNxLEpMBGpABCmoIARJmGmQKVAgGElA6TgpMGkoKFAgFEhASDggBEgIIAhICCAESAggBChgIAxIUEhIIARICCAISAggCEgIIAxICCAEKGAgEEhQSEggBEgIIAhICCAISAggDEgIIAgoMCAESCBIGCAMSAggBCiIIAhIeIhwKEgoIEgYIAxICCAMSBjIECgIIAhIGMgQKAggBEsEBIr4BCrsBCiRSIggBEh5KHAgBEggIEDIECgIIABoOUgwIAhIIEgYIAxICCAISkgEajwEKjAEIARKHARqEAQqBAQjclNxLEnoaeApqCAESZhpkClQIBhJQOk4KTBpKChQIBRIQEg4IARICCAISAggBEgIIBAoYCAMSFBISCAESAggCEgIIAhICCAESAggBChgIBBIUEhIIARICCAISAggCEgIIARICCAIKDAgBEggSBggDEgIIAgoKCAISBjIECgIIARJkImIKYAoOUgwIARIIEgYIAxICCAMSThpMChEIARINGgsKCQinlNxLEgIaAAo3CAISMxoxCi8IhIu9UBIoGiYKDQgNEgkyBwoFDQAAgD8KFQgEEhEaDwoNCAESCTIHCgUNAAAgQRKqBiKnBgqkBgokUiIIARIeShwIARIICBAyBAoCCAAaDlIMCAISCBIGCAMSAggEEvsFGvgFChEIARINGgsKCQinlNxLEgIaAAr_AggCEvoCGvcCCvABCISLvVAS6AEa5QEKIggQEh4iHAoSCggSBggDEgIIAxIGMgQKAggCEgYyBAoCCAQKCggKEgYyBAoCCAEKCggMEgYyBAoCCAQKCggLEgYyBAoCCAMKDQgOEgkyBwoFDQAAAAAKEAgCEgwaCgoICAESBBICCAQKRAgIEkAaPgolCAUSIRofCh0IARIZIhcKFQoIEgYIAxICCAMSCTIHCgUNAACAQQoVCAYSERoPCg0IARIJMgcKBQ0AAJBBCjQICRIwGi4KFQgFEhEaDwoNCAESCTIHCgUNAAAgQQoVCAYSERoPCg0IARIJMgcKBQ0AAIBBCj0IlZe9UBI2GjQKDQgFEgkyBwoFDQAAAEAKFAgDEhASDggBEgIIAhICCAESAgggCg0IBBIJMgcKBQ0AAIA_CioIuZe9UBIjGiEKHwgBEhsaGQoXCPS__F0SEBoOCgwIARIIEgYIAxICCAQKFwjrmL1QEhAaDgoMCAESCBIGCAMSAggGCuACCAMS2wJa2AIIARJ-GnwKOQgBEjUaMwoxCLmU3EsSKhooCiYIARIiGiAKHggBEhpaGAgBEhQaEgoQCAESDBIKCAMSAggHEgIIAQo_CAISOxo5CjcIhIu9UBIwGi4KFQgCEhEaDwoNCAESCTIHCgUNAACQQQoVCAMSERoPCg0IARIJMgcKBQ0AAJBBEj8aPQoRCAESDRoLCgkIp5TcSxICGgAKKAgCEiQaIgogCISLvVASGRoXChUIAxIRGg8KDQgBEgkyBwoFDQAAwEASkgEajwEKjAEIARKHARqEAQqBAQjclNxLEnoaeApqCAESZhpkClQIBhJQOk4KTBpKChQIBRIQEg4IARICCAISAggBEgIIHwoYCAMSFBISCAESAggCEgIIAhICCAUSAggBChgIBBIUEhIIARICCAISAggCEgIIBRICCAIKDAgBEggSBggDEgIIBQoKCAISBjIECgIIARIOCAMYBCIIEgYIARICCAESDwgEGAQiCTIHCgUNAAAAQhIECAUYAxIGCAYQEBgDEgYIBxAQGAMYrtC2gO6Jool2Cp0DCiFjYXJkX2RpdmlkZXIuZW1sfDk2Y2E5N2UyZjE0MGMyMzYS9wIKM3R5cGUuZ29vZ2xlYXBpcy5jb20veW91dHViZS5lbGVtZW50cy5UZW1wbGF0ZUNvbmZpZxK_ArLHzocFuAISqgISBAgBGAESoQIIAhgCIpoCGpcCCh0IARIZGhcKFQinlNxLEg4aDAoKCAESBjIECgIIAQpICAISRBpCCkAIhIu9UBI5GjcKCggKEgYyBAoCCAMKCggMEgYyBAoCCAUKHQgJEhkaFwoVCAgSERoPCg0IARIJMgcKBQ0AAEBBCqsBCAMSpgFaowEIARKeARqbAQoRCAESDRoLCgkIp5TcSxICGgAKhQEIAhKAARp-ClsIhIu9UBJUGlIKCggKEgYyBAoCCAMKIQgDEh0aGwoNCAESCTIHCgUNAACAPwoKCAISBjIECgIIAgoVCAISERoPCg0IARIJMgcKBQ0AAIA_CgoIEBIGMgQKAggFCh8IlZe9UBIYGhYKFAgBEhASDggBEgIIARICCAYSAggQGLDbuZLj4KXxzAE", 8));
            C62921ba a2 = C62921ba.m95368a();
            View c = a.f68794b.mo32471c((C57784p) C62942bv.parseFrom((C62942bv) C57784p.f154382f, A, a2));
            c.getClass();
            viewGroup2.addView(c);
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C25290c.f68793a.mo56226d()).mo56382g(e)).mo56372aa(49834)).mo56386p("Failed to render the Elements prewarming card.");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C25288a.m46644a(th, th2);
            }
            throw th;
        }
        C47831fm.m85019n();
        return viewGroup2;
    }

    public final void onDestroy() {
        C47573bx b = this.f68791d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f68791d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f68791d.mo51376d();
        try {
            super.onDetach();
            this.f68792e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f68791d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f68791d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f68791d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f68791d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f68791d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f68791d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f68791d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25288a.m46644a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f68791d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f68791d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f68791d.mo51381i();
        try {
            if (!this.f68792e) {
                super.onAttach(context);
                if (this.f68788a == null) {
                    this.f68788a = new C25290c((C27014b) ((C74176nj) mo30368d().mo17653jN()).f206836d.f205249aQ.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f68791d, this.f68790c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f68791d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C25288a.m46644a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
